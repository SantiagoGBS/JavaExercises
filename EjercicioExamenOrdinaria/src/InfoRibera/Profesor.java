package InfoRibera;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Profesor extends Personas {

	protected String titulacion;
	protected ArrayList<Modulo> modulosImpartidos;

	public Profesor(int codigo, String dNI, String nombre, String apellidos, int edad, String titulacion) {
		super(codigo, dNI, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.modulosImpartidos = new ArrayList<>();
	}

	public Profesor(int codigo, String dNI, String nombre, String apellidos, int edad) {
		super(codigo, dNI, nombre, apellidos, edad);
	}

	public Profesor() {
		// TODO Auto-generated constructor stub
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

	public void cargaModulosImpartidos() {
		// Este metodo se conectara a la BBDD de la
		// aplicacion y cargara los modulos que imparte el profesor
		// crear objeto base de datos y cargarparametros del objeto base de datos
		// CUANDO estes en una clase que no lo tienes creado
		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		ArrayList<Modulo> modulosImpartidos = new ArrayList<>();
		try {
			ResultSet rset = bbdd.consultaBD(
					"select m.codigo, m.nombre, m.horas, m.curso from modulos m join personas p on p.codigo=m.cod_profesor where p.dni ='"
							+ this.DNI + "'");
			while (rset.next()) {
				this.modulosImpartidos
						.add(new Modulo(rset.getString(1), rset.getString(2), rset.getInt(3), rset.getInt(4)));

			}
			// para hacer un for each se pone:
			// la clase de la que se quiere hacer o si es un String, int... (en este caso
			// Modulo, luego como quieres
			// llamar al resultado en este caso i y de que lo quieres hacer, en este caso
			// del arraylist modulosImpartidos)

			bbdd.cerrarConsulta();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Modulo> getModulosimpartidos() {

		return modulosImpartidos;

	}

	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

}
