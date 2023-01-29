package ejemplos;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	// Constructor
	// Inicializa variables y reserva memoria
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}

	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		this.dni = dni;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
