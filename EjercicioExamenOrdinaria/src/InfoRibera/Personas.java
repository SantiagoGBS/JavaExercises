package InfoRibera;

public abstract class Personas {

	protected int codigo;
	protected String DNI;
	protected String nombre;
	protected String apellidos;
	protected int edad;

	public Personas(int codigo, String dNI, String nombre, String apellidos, int edad) {
		super();
		this.codigo = codigo;
		this.DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Personas() {
		super();
		this.codigo = 0;
		DNI = "";
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

}
