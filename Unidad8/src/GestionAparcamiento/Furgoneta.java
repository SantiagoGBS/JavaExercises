package GestionAparcamiento;

public class Furgoneta extends Vehiculo {
	private int capacidad;

	public Furgoneta(String matricula, String color, String marca, String modelo, int capacidad) {
		super(matricula, color, marca, modelo);
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Furgoneta [capacidad=" + capacidad + "]";
	}

}
