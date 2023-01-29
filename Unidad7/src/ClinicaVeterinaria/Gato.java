package ClinicaVeterinaria;

import java.util.ArrayList;

public class Gato extends Animal {
	private boolean obesidad;

	public Gato(String nombre) {
		super(nombre);
		this.obesidad = false;
	}

	public Gato(int edad, int peso, String raza, String sexo, String nombre, ArrayList<Vacunas> libroVacunas,
			boolean obesidad) {
		super(edad, peso, raza, sexo, nombre, libroVacunas);
		this.obesidad = obesidad;
	}

	public boolean isObesidad() {
		return obesidad;
	}

	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}

	public static void main(String[] args) {
		Gato g = new Gato("Leon");
		Gato g1 = new Gato(15, 10, "siames", "masculini", "guantes", null, false);
		ArrayList<Vacunas> listaVacunas = new ArrayList<>();
		listaVacunas.add(new Vacunas("Moderna", 1994, "ModernaLabs", 34));
		System.out.println(g);
		System.out.println(g1);
	}

	@Override
	public String toString() {
		return "Gato [obesidad=" + obesidad + ", edad=" + edad + ", peso=" + peso + ", raza=" + raza + ", sexo=" + sexo
				+ ", nombre=" + nombre + ", LibroVacunas=" + LibroVacunas + "]";
	}

}
