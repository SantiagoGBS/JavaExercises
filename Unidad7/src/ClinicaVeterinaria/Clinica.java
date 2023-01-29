package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {

	private ArrayList<Cliente> clientes;

	public Clinica() {
		this.clientes = new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void menu() {
		System.out.println("1.- Dar de alta cliente");
		System.out.println("2.- Baja cliente");
		System.out.println("3.- Atender cliente");
		System.out.println("4.- Salir");
		System.out.println("Elige una opcion");

	}

	public static void main(String[] args) {
		// CREAR OBJETOS

		// CREAR OBJETO VACUNA

		// CREAR OBJETO MASCOTAS

		// CREAR OBJETO CLIENTES

		Clinica c = new Clinica();
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			c.menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: // DAR DE ALTA CLIENTE

				break;
			case 2: // dar de baja--> buscar DNI

				break;
			case 3: // ATENDER CLIENTE----> buscar DNI

				// VER MASCOSTAS

				// DAR DE ALTA

				//
				break;
			case 4:

				salir = true;
				break;

			}
		} while (!salir);

	}

}
