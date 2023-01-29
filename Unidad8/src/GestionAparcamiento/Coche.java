package GestionAparcamiento;

public class Coche extends Vehiculo {
	private int nPuertas;

	public Coche(String matricula, String color, String marca, String modelo, int nPuertas) {
		super(matricula, color, marca, modelo);
		this.nPuertas = nPuertas;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	@Override
	public String toString() {
		return "Coche [nPuertas=" + nPuertas + "]";
	}

}
