package Examenprog;

public class grupo {
	protected String codigo;
	protected String nombre;
	protected String a�o;
	protected String genero;

	public grupo(String codigo, String nombre, String a�o, String genero) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.a�o = a�o;
		this.genero = genero;
	}

	public grupo() {

		this.codigo = "";
		this.nombre = "";
		this.a�o = "";
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

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "grupo [codigo=" + codigo + ", nombre=" + nombre + ", a�o=" + a�o + ", genero=" + genero + "]";
	}

}
