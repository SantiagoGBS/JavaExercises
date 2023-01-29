package repaso;

public class Gato extends Mascota {
	private boolean estaMaullando;

	public Gato(String nombre, int edad, boolean estaMaullando) {
		super(nombre, edad);
		this.estaMaullando = estaMaullando;
		this.id = this.generarId();
	}

	public boolean isEstaMaullando() {
		return estaMaullando;
	}

	public void setEstaMaullando(boolean estaMaullando) {
		this.estaMaullando = estaMaullando;
	}

	public String generarId() {
		return "G" + this.getNombre().substring(0, 2) + (int) (Math.random() * 20);
	}

	@Override
	public String toString() {
		return "Gato [estaMaullando=" + estaMaullando + ", id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public static void main(String[] args) {
		Gato g = new Gato("Misi", 2, false);
		System.out.println(g);
	}

}
