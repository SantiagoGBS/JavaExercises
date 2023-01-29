package appmusic;

public class grupo {
	protected int codigo;
	protected String nombre;
	protected int a�o;
	protected String genero;

	public grupo(int codigo, String nombre, int a�o, String genero) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.a�o = a�o;
		this.genero = genero;
	}

	public grupo() {

		this.codigo = 0;
		this.nombre = "";
		this.a�o = 0;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
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
