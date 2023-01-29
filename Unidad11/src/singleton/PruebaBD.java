package singleton;

import java.sql.ResultSet;

public class PruebaBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BD miconexion = BD.getInstance();
		BD miconexion2 = BD.getInstance();
		miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
		miconexion.setUsuario("jardineria2");
		miconexion.setPass("jardineria2");
		try {
			ResultSet rset = miconexion.consultaBD("select count(*) from pedidos");
			while (rset.next())
				System.out.println(rset.getString(1));
			miconexion.cerrarConsulta();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
