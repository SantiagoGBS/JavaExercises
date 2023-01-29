package ClinicaRibera;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica implements EntradasUsuario {
	ArrayList<Profesionales> medicos;
	ArrayList<Pacientes> pacientes;

	public ArrayList<Profesionales> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Profesionales> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Pacientes> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Pacientes> pacientes) {
		this.pacientes = pacientes;
	}

	public static void main(String[] args) {
		Clinica nuevo = new Clinica();
		String opcion = "";
		boolean testigo = false;
		do {
			System.out.println("*****Elija la opción que desea*****");
			System.out.println("1	Listado de pacientes");
			System.out.println("2	Cargar historias clínicas");
			System.out.println("3	Atender pacientes");
			System.out.println("4	Salir");
			opcion = "";
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextLine();
			switch (Integer.parseInt(opcion)) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {
				testigo = true;
				break;
			}
			}
			nuevo.Comprueba(opcion);
		} while (!testigo);
	}

	private void ListarporEspecialidad(String especialidad) {
		// Lista por cada especialista los pacientes que tenga.
		System.out.println("*****" + especialidad + "*****");
		for (int i = 0; i < medicos.size(); i++) {
			if (medicos.get(i).getEspecialidad().equals(especialidad)) {

			}
		}
	}

	public void leerFichero(String fichero) {
		// Metodo para LEER EL FICHERO y cargarlo a los arrays
		File CSV = new File("personas.csv");
		String[] espacio;
		String cadena = "";
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			cadena = sc.nextLine();
			espacio = cadena.split(";");
			String paciente = "paciente";
			String medico = "medico";
			sc.nextLine();
			if (espacio[0] == paciente) {
				pacientes.add(new Pacientes(espacio[1], espacio[2], espacio[3], espacio[4],
						Integer.parseInt(espacio[7]), Integer.parseInt(espacio[8]), espacio[10]));
			}
			if (espacio[0] == medico) {
				medicos.add(new Profesionales(espacio[1], espacio[2], espacio[3], espacio[4],
						Integer.parseInt(espacio[6]), espacio[5]));
			}
		}
	}

	public boolean Comprueba(String opcion) {
		// Metodo para comprobar si es un numero
		try {
			Integer.parseInt(opcion);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
