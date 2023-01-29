package LecturaEscritura_Objetos;

import java.io.Serializable;

public class Contacto implements Serializable {
	private String nombreCompleto;
	private String telefono;
	private String direccion;
	private String correo;

	public Contacto(String nombreCompleto, String telefono, String direccion, String correo) {
		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Contacto [nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", correo=" + correo + "]";
	}

}
