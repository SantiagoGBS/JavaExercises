package Examenprog;

public class grupo {
	protected String codigo;
	protected String nombre;
	protected String año;
	protected String genero;

	public grupo(String codigo, String nombre, String año, String genero) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.genero = genero;
	}

	public grupo() {

		this.codigo = "";
		this.nombre = "";
		this.año = "";
		this.genero = "";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "grupo [codigo=" + codigo + ", nombre=" + nombre + ", año=" + año + ", genero=" + genero + "]";
	}

}
