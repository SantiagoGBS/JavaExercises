package repaso;

import java.util.ArrayList;

public class Programa extends Mascota {
	public ArrayList<Mascota> mascota;

	public Programa(ArrayList<Mascota> mascota) {
		super();
		this.mascota = new ArrayList<>();
	}

	public ArrayList<Mascota> getMascota() {
		return mascota;
	}

	public void setMascota(ArrayList<Mascota> mascota) {
		this.mascota = mascota;
	}

	public String mayorEdad() {
		int mayor = 0;
		String nombremascota = "";
		if()
		for (int i = 0; i < mascota.size(); i++) {
			if (mascota.get(i).getEdad() > 0 && mascota.get(i).getEdad() > mayor) {
				mayor = mascota.get(i).getEdad();
				nombremascota = mascota.get(i).getNombre();
			}

		}
		return nombremascota;

	}

	public static void main(String[] args) {

	}
}
