package appmusic;

public class grupo {
	protected int codigo;
	protected String nombre;
	protected int año;
	protected String genero;

	public grupo(int codigo, String nombre, int año, String genero) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.genero = genero;
	}

	public grupo() {

		this.codigo = 0;
		this.nombre = "";
		this.año = 0;
		this.genero = "";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
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
