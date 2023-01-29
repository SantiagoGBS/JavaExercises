package Cine;

public class Pelicula {
	private String nombre;
	private String director;
	private String genero;
	private int a�o;

	public Pelicula(String nombre, String director, String genero, int a�o) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.a�o = a�o;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", a�o=" + a�o + "]";
	}

}
