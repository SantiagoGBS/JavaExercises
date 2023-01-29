package ClinicaVeterinaria;

import java.util.ArrayList;

public class Perro extends Animal {
	private boolean seguro;
	private String chipIden;

	public Perro(int edad, int peso, String raza, String sexo, String nombre, ArrayList<Vacunas> libroVacunas,
			boolean seguro, String chipIden) {
		super(edad, peso, raza, sexo, nombre, libroVacunas);
		this.seguro = seguro;
		this.chipIden = chipIden;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public String getChipIden() {
		return chipIden;
	}

	public void setChipIden(String chipIden) {
		this.chipIden = chipIden;
	}

	@Override
	public String toString() {
		return "Perro [seguro=" + seguro + ", chipIden=" + chipIden + ", edad=" + edad + ", peso=" + peso + ", raza="
				+ raza + ", sexo=" + sexo + ", nombre=" + nombre + ", LibroVacunas=" + LibroVacunas + "]";
	}

}
