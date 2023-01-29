package Videoclub;

public class Alquiler {
	private DVD alquilado;
	private int tiempo;

	public Alquiler() {
		this.alquilado = null;
		this.tiempo = 0;
	}

	public Alquiler(DVD alquilado, int tiempo) {
		this.alquilado = alquilado;
		this.tiempo = tiempo;
	}

	public DVD getAlquilado() {
		return alquilado;
	}

	public int getTiempo() {
		return tiempo;
	}

	public static void main(String[] args) {
		DVD miDVD = new DVD("Shrek", DVD.INFANTIL);
		Alquiler a = new Alquiler(miDVD, 3);

		System.out.println(a.getAlquilado().getTitulo() + " durante " + a.tiempo);
	}

}
