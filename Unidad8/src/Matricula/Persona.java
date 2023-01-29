package Matricula;

public class Persona {
	int codigo;
	String DNI;
	String nombre;
	String apellidos;

	public Persona(int codigo, String dNI, String nombre, String apellidos) {
		super();
		this.codigo = codigo;
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
