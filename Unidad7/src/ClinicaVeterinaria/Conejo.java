package ClinicaVeterinaria;

import java.util.ArrayList;

public class Conejo extends Animal {
	private int longOrejas;

	public Conejo(int edad, int peso, String raza, String sexo, String nombre, ArrayList<Vacunas> libroVacunas,
			int longOrejas) {
		super(edad, peso, raza, sexo, nombre, libroVacunas);
		this.longOrejas = longOrejas;
	}

	public int getLongOrejas() {
		return longOrejas;
	}

	public void setLongOrejas(int longOrejas) {
		this.longOrejas = longOrejas;
	}

	@Override
	public String toString() {
		return "Conejo [longOrejas=" + longOrejas + "]";
	}

}
