package LecturaEscritura_Objetos;

import java.util.Scanner;

public class Programa {
	public void menu() {
		System.out.println("***************************************************");
		System.out.println("1)Imprimir agenda");
		System.out.println("2) Añadir contacto");
		System.out.println("3) Eliminar contacto");
		System.out.println("4) Salir");
		System.out.println("Elige una opcion: ");
		System.out.println("***************************************************");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		Programa p = new Programa();
		Agenda agenda = new Agenda();
		agenda.cargarAgenda("contactos.bin");
		String nombre = "", direccion = "", email = "", telefono = "";
		do {
			p.menu();
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:
				agenda.imprimirAgenda();
				break;
			case 2:

				System.out.println("Escriba nombre");
				nombre = sc.next();
				System.out.println("Escriba telefono");
				telefono = sc.next();
				System.out.println("Escriba direccion");
				direccion = sc.next();
				System.out.println("Escriba email");
				email = sc.next();
				Contacto c = new Contacto(nombre, telefono, direccion, telefono);
				agenda.addContacto(c);
				break;
			case 3:
				agenda.imprimirAgenda();
				nombre = sc.nextLine();
				agenda.eliminarContacto(nombre);
				agenda.imprimirAgenda();
				break;
			case 4:
				salir = true;
				break;
			}

		} while (!salir);

	}

}
