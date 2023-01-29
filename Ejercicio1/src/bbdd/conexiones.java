package bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class conexiones {
	public static void main(String[] args) {
	//	Para realizar conexiones a la base de datos deberas seguir el siguiente orden
	//	1º-> creamos un objeto BD
		BD bbdd = BD.getInstance();
//		2º-> cargamos los parametros del archivo
		bbdd.cargarParametrosConexion();
//		3º-> ejecutamos la consulta de la siguiente manera
		try {
			ResultSet rset = bbdd.consultaBD("consulta");
//			si la consulta es un update, insert o delete deberemos realizar un commit de la siguiente manera
			rset = bbdd.consultaBD("commit");
//			si la consulta es un select deberemos realizar un bucle para recorrer los resultados
			while(rset.next()) {
//				podremos acceder a la columna del registro indicando el nº de columna que queramos teniendo en cuenta que empieza por 1
				rset.getString(1);
			}
//			Al final cerraremos las consultas
			rset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
