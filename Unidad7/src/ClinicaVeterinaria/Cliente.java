package ClinicaVeterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private int DNI;
	private String eMail;
	private ArrayList<Animal> mascotas;

	public Cliente() {
		this.nombre = "";
		DNI = 0;
		this.eMail = "";
		this.mascotas = new ArrayList<>();
	}

	public Cliente(String nombre, int dNI, String eMail, ArrayList<Animal> mascotas) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.eMail = eMail;
		this.mascotas = mascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", DNI=" + DNI + ", eMail=" + eMail + ", mascotas=" + mascotas + "]";
	}

}
