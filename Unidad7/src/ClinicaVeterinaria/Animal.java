package ClinicaVeterinaria;

import java.util.ArrayList;

public class Animal {
	protected int edad;
	protected int peso;
	protected String raza;
	protected String sexo;
	protected String nombre;
	protected ArrayList<Vacunas> LibroVacunas;

	public Animal(String nombre) {
		this.edad = 0;
		this.peso = 0;
		this.raza = "";
		this.sexo = "";
		this.nombre = nombre;
		this.LibroVacunas = new ArrayList<>();
	}

	public Animal(int edad, int peso, String raza, String sexo, String nombre, ArrayList<Vacunas> libroVacunas) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		LibroVacunas = libroVacunas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vacunas> getLibroVacunas() {
		return LibroVacunas;
	}

	public void setLibroVacunas(ArrayList<Vacunas> libroVacunas) {
		LibroVacunas = libroVacunas;
	}

	@Override
	public String toString() {
		return "Animal [edad=" + edad + ", peso=" + peso + ", raza=" + raza + ", sexo=" + sexo + ", nombre=" + nombre
				+ ", LibroVacunas=" + LibroVacunas + "]";
	}

}
