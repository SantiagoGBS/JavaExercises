package FrutasRibera;

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
		File fichero = new File("configTienda.txt");

		try {
			Scanner entrada = entrada = new Scanner(fichero);
			String cadena;
			int contador = 0;
			do {
				cadena = entrada.nextLine();
				linea = cadena.split("=");
				contador++;
				if (contador == 1) {
					this.cadenaConexion = linea[1];
//					System.out.println(this.cadenaConexion);
				}
				if (contador == 2) {
					this.usuario = linea[1];
//					System.out.println(this.usuario);
				}
				if (contador == 3) {
					this.pass = linea[1];
//					System.out.println(this.pass);
				}

			} while (entrada.hasNext());
		} catch (FileNotFoundException e) {
			return false;
		}
		return true;
	}

	public ArrayList<Cliente> cargaClientes() {
		ArrayList<Cliente> misclientes = new ArrayList<>();

		try {
			ResultSet rset = this.consultaBD("select * from persona where turno=0");
			while (rset.next()) {
				misclientes.add(new Cliente(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return misclientes;
	}

//	public static void main(String[] args) {
//		BD bbdd = BD.getInstance();
//		bbdd.cargarParametrosConexion();
//		bbdd.cargaClientes();
//		for (Cliente Cliente : bbdd.cargaClientes()) {
//			System.out.println(Cliente.toString());
//		}
//
//	}

	public void cerrarConsulta() throws SQLException {
		stmt.close();
	}

}
