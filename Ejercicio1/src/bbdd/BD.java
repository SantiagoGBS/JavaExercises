package bbdd;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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

	public String getPassword() {
		return pass;
	}

	public void setPassword(String pass) {
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
	BD() {
		if (!permitirInstancianueva)
			System.out.println("No se puede crear otra instancia. Usa getInstace()");
	}

	// La primera y unica vez que se crea
	// Fijate que se inicializa a nulo al declarar la variable de la clase
	public static BD getInstance() {
		if (miInstancia == null) {
			permitirInstancianueva = true;
			miInstancia = new BD();
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
		File fichero = new File("configTienda.txt");
		String[] conf;
		try {
			Scanner entrada = new Scanner(fichero);
				conf=entrada.nextLine().split("-");
					this.cadenaConexion = conf[0];
					this.usuario=conf[1];
					this.pass=conf[2];
			entrada.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}	

	public void cerrarConsulta() throws SQLException {
		stmt.close();
	}
}
