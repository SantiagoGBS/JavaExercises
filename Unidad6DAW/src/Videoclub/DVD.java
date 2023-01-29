package Videoclub;

public class DVD {
	public static final int NORMAL = 0;
	public static final int NOVEDAD = 1;
	public static final int INFANTIL = 2;

	private String titulo;
	private int tipo;

	// Constructor con dos parámetros
	public DVD(String titulo, int tipo) {

		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return titulo;
	}

	public static void main(String[] args) {
		DVD miDVD = new DVD("Shrek", DVD.INFANTIL);
		System.out.println(miDVD);
	}

}
