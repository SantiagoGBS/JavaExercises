package repaso;

public class Perro extends Mascota {
	private boolean estaLadrando;

	public Perro(String nombre, int edad, boolean estaLadrando) {
		super(nombre, edad);
		this.estaLadrando = estaLadrando;
		// this.id=this.generarId();
	}

	public boolean isEstaLadrando() {
		return estaLadrando;
	}

	public void setEstaLadrando(boolean estaLadrando) {
		this.estaLadrando = estaLadrando;
	}

	@Override
	public String toString() {
		return "Perro [estaLadrando=" + estaLadrando + ", id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String generarId() {
		return "P" + this.getNombre().substring(0, 2) + (int) (Math.random() * 20);
	}
}
