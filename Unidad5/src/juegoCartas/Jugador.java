package juegoCartas;

public class Jugador {

	private String nombre;
	private Carta c; // Objeto de la clase Carta

	// Constructor por defecto
	public Jugador() {
		this.nombre = "";
		this.c = new Carta();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta getC() {
		return c;
	}

	public void setC(Carta c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", c=" + c + "]";
	}

}
