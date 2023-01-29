package Actividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbAccess {

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
		ResultSet rset = stmt.executeQuery("select codigocliente,nombrecliente from clientes");

		// 5.- Recorrer la tabla
		while (rset.next())
			System.out.println(rset.getString(1) + " " + rset.getString(2));

		// 6.- Cerrar la conexion
		stmt.close();
	}

}
