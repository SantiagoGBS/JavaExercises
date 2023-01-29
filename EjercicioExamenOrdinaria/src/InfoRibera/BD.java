package InfoRibera;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class BD {
	private static BD miInstancia = null;
	private static boolean permitirInstancianueva;
	private String cadenaConexion;
	private String usuario;
	private String pass;
	private Connection conn;
	private Statement stmt;

	public String getCadenaConexion() {
		return cadenaConexion;
	}

	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	// Con el booleano permitirInstancianueva controlar que solo exista una
	BD() throws Exception {
		if (!permitirInstancianueva)
			throw new Exception("No se puede crear otra instancia. Usa getInstance");

	}

	// La primera y unica vez que se crea
	// Fijate que se inicializa a nulo al declarar la variable de la clase
	public static BD getInstance() {
		if (miInstancia == null) {
			permitirInstancianueva = true;
			try {
				miInstancia = new BD();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			permitirInstancianueva = false;
		}

		return miInstancia;

	}

	// Devuelve el conjunto de tuplas de la consulta
	public ResultSet consultaBD(String consulta) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		conn = DriverManager.getConnection(cadenaConexion, usuario, pass);
		stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(consulta);
		return rset;
	}

	public boolean cargarParametrosConexion() {
		String[] linea;
		File fichero = new File("config.txt");

		try {
			Scanner entrada = entrada = new Scanner(fichero);
			String cadena;
			do {
				cadena = entrada.nextLine();
				linea = cadena.split("=");
				if (linea[0].equals("cadena")) {
					this.cadenaConexion = linea[1];
				} else if (linea[0].equals("usuario")) {
					this.usuario = linea[1];
				} else if (linea[0].equals("password")) {
					this.pass = linea[1];
				}
			} while (entrada.hasNext());
		} catch (FileNotFoundException e) {
			return false;
		}
		return true;
	}

	public void cargaNotas(String fichero) {
		// crear objeto base de datos y cargarparametros del objeto base de datos
		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		String[] linea;
		File fichero2 = new File(fichero);
		int suma = 0;
		int contador = 0;
		int alumno = 0;

		try {
			Scanner entrada = entrada = new Scanner(fichero2);
			String cadena;
			entrada.nextLine();
			do {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				if (alumno == 0) {
					alumno = Integer.parseInt(linea[1]);
				}
				if (!(alumno == Integer.parseInt(linea[1]))) {
					bbdd.consultaBD("INSERT INTO NOTAS (cod_modulo, cod_alumno, nota_final) values ('" + linea[0] + "',"
							+ alumno + ", " + (float) suma / contador + ")");
					contador = 0;
					suma = 0;
				}
				contador++;
				suma += Integer.parseInt(linea[3]);
				alumno = Integer.parseInt(linea[1]);

			} while (entrada.hasNext());
			contador++;
			suma += Integer.parseInt(linea[3]);
			alumno = Integer.parseInt(linea[1]);
			bbdd.consultaBD("INSERT INTO NOTAS (cod_modulo, cod_alumno, nota_final) values ('" + linea[0] + "',"
					+ alumno + ", " + (float) suma / contador + ")");
			System.out.println("Cargada la nota final de 2 alumnos para el m�dulo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero de notas no existe");
		}

	}

	public ArrayList<Profesor> cargaProfesores() {
		ArrayList<Profesor> profesores = new ArrayList<>();
		Profesor profesor;
		try {
			ResultSet rset = this.consultaBD("select*from personas where titulacion is not null");
			while (rset.next()) {
				profesor = new Profesor(Integer.parseInt(rset.getString(1)), rset.getString(2), rset.getString(3),
						rset.getString(4), Integer.parseInt(rset.getString(5)), rset.getString(6));
				profesor.cargaModulosImpartidos();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public ArrayList<Alumno> cargaAlumnos() {
		ArrayList<Alumno> alumnos = new ArrayList<>();
		Alumno alumno;
		try {
			ResultSet rset = this.consultaBD("select CODIGO ,DNI ,NOMBRE ,APELLIDOS ,EDAD ,TITULACION,nvl(media,0) from"
					+ "(select cod_alumno,avg(nota_final) as media from notas group by cod_alumno)"
					+ "right join personas on personas.codigo=cod_alumno where personas.titulacion is null order by codigo");
			while (rset.next()) {
				alumno = new Alumno(Integer.parseInt(rset.getString(1)), rset.getString(2), rset.getString(3),
						rset.getString(4), Integer.parseInt(rset.getString(5)));
				if (Float.parseFloat(rset.getString(7)) == 0) {
					alumno.setMediaExpediente(0);
				} else {
					alumno.setMediaExpediente(alumno.cargaMediaExpediente());
				}

				alumnos.add(alumno);

			}
			this.cerrarConsulta();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alumnos;
	}

	public void cerrarConsulta() throws SQLException {
		stmt.close();
	}
	// Anadir Getters y Setters

}
