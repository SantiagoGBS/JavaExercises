package repaso;

public class Mascota implements Identificacion {
	protected String id;
	protected String nombre;
	protected int edad;

	public Mascota() {

		this.nombre = "";
		this.edad = 0;
	}

	public Mascota(String nombre, int edad) {
		super();

		this.nombre = nombre;
		this.edad = edad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String generarId() {

		return "";
	}

}
