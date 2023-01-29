package Videoclub;

public class Cliente {
	private String nombre;
	private Alquiler[] salida;
	private int posicion; // indica la cantidad de peliculas que ha alquilado <5

	public Cliente(String nombre) {
		this.nombre = nombre;
		// Máximo 5 alquileres
		this.salida = new Alquiler[5];
		this.posicion = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alquiler[] getSalida() {
		return salida;
	}

	public void setSalida(Alquiler[] salida) {
		this.salida = salida;
	}

	public void generarTicket() {
		double precio = 0;
		System.out.println(this.getNombre());

		for (int i = 0; i < this.posicion; i++) {
			// Según el tipo del DVD calculo el precio de alquiler

			switch (this.getSalida()[i].getAlquilado().getTipo()) {
			case DVD.NORMAL:
				precio = 2 * this.getSalida()[i].getTiempo();
				break;
			case DVD.INFANTIL:
				precio = 1.5 * this.getSalida()[i].getTiempo();
				break;
			case DVD.NOVEDAD:
				precio = 3 * this.getSalida()[i].getTiempo();
				break;

			}

			System.out.println("\t" + this.getSalida()[i].getAlquilado() + " " + precio + "€");
		}

		System.out.println("IMPORTE TOTAL: ");
		System.out.println("Numero de puntos: ");
	}

	public void nuevoAlquiler(Alquiler a) {
		this.salida[posicion] = a;
		this.posicion++;
	}

	public static void main(String[] args) {
		DVD miDVD = new DVD("Shrek", DVD.INFANTIL);
		Alquiler a = new Alquiler(miDVD, 3);

		Cliente c = new Cliente("Juan Fernandez");
		c.nuevoAlquiler(a);
		c.generarTicket();

	}

}
