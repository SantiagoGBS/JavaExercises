package Examenprog;

import java.sql.ResultSet;

public class PruebaBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BD miconexion = BD.getInstance();
		BD dardealtagrupo = BD.getInstance();
		miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
		miconexion.setUsuario("examen");
		miconexion.setPass("examen");

		try {
			ResultSet rset = dardealtagrupo.consultaBD("INSERT INTO GRUPOS VALUES" + (nuevocodigo));
			while (rset.next())
				System.out.println(rset.getString(1));
			miconexion.cerrarConsulta();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
