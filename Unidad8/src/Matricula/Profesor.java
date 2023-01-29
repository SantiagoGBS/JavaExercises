package Matricula;

public class Profesor extends Persona {

	public Profesor(int codigo, String dNI, String nombre, String apellidos) {
		super(codigo, dNI, nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public Profesor(int codigo, String dNI, String nombre, String apellidos, String titulacion) {
		super(codigo, dNI, nombre, apellidos);
		this.titulacion = titulacion;
	}

	public String titulacion;

}
