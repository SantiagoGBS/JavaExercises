package InfoRibera;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Profesor extends Personas {
	protected String titulacion;
	protected ArrayList<Modulo> modulosImpartidos;

	public Profesor(int codigo, String dNI, String nombre, String apellidos, int edad, String titulacion) {
		super(codigo, dNI, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.modulosImpartidos = new ArrayList<Modulo>();
	}

	public Profesor() {
		super();
		this.titulacion = "";
		this.modulosImpartidos = new ArrayList<Modulo>();
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public ArrayList<Modulo> getModulosImpartidos() {
		return modulosImpartidos;
	}

	public void setModulosImpartidos(ArrayList<Modulo> modulosImpartidos) {
		this.modulosImpartidos = modulosImpartidos;
	}

	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

	// Cargo los modulos impartidos desde la BBDD hasta la clase Modulo en el
	// arraylist
	public void cargarModulosImpartidos() {

		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		try {
			ResultSet rset = bbdd.consultaBD("select * from modulos where cod_profesor=" + this.codigo);
			while (rset.next()) {
				this.modulosImpartidos.add(new Modulo(rset.getString(1), rset.getString(2),
						Integer.parseInt(rset.getString(3)), Integer.parseInt(rset.getString(4))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		Profesor profesor = new Profesor();
//		profesor.setCodigo(100);
//		profesor.cargarModulosImpartidos();
//		for (Modulo i : profesor.getModulosImpartidos()) {
//			System.out.println(i.toString());
//		}
//	}

}
