package Actividades;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Actividad1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// 1.- Crear el driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		// 2.- Crear la conexion con el servidor Oracle
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jardineria2",
				"jardineria2");

		// 3.-Crear la consulta
		// 4.- Ejecutar la consulta
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt
				.executeQuery("select codigocliente,nombrecontacto,apellidocontacto,telefono from clientes");

		// 5.- Recorrer la tabla
		// escribir
		PrintWriter salida = null;
		File fichero = new File("clientes.html");
		try {
			salida = new PrintWriter("clientes.html");
			salida.print("<html><body><h1>Clientes>");
			while (rset.next())
				salida.println(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3) + " "
						+ rset.getString(4));
			salida.print("</html></body>");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error en escritura");
		}

		// 6.- Cerrar la conexion
		stmt.close();

	}

}
