package ClinicaVeterinaria;

public class Vacunas {
	private String nombre;
	private int fecha;
	private String laboratorio;
	private int precio;

	public Vacunas(String nombre, int fecha, String laboratorio, int precio) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vacunas [nombre=" + nombre + ", fecha=" + fecha + ", laboratorio=" + laboratorio + ", precio=" + precio
				+ "]";
	}
}
