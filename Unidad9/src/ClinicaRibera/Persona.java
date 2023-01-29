package ClinicaRibera;

public abstract class Persona {
	protected String DNI;
	protected String Nombre;
	protected String Apellidos;
	protected String Telefono;

	public Persona(String dNI, String nombre, String apellidos, String telefono) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Telefono = telefono;
	}

	public Persona() {

		DNI = "";
		Nombre = "";
		Apellidos = "";
		Telefono = "";
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono
				+ "]";
	}

}
