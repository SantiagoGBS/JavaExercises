package Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	private ArrayList<Pelicula> lista;

	public Programa() {
		this.lista = new ArrayList<>();
	}

	public ArrayList<Pelicula> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pelicula> lista) {
		this.lista = lista;
	}

	public void menud() {
		System.out.println("1( Añadir pelicula");
		System.out.println("2( Borrar pelicula");
		System.out.println("1( Mostrar pelicula");
		System.out.println("1( Buscar pelicula");
		System.out.println("5( Salir");
		System.out.println("Elige una opcion ");
	}

	public static void main(String[] args) {

		// BASE DE DATOS""""
		Programa p = new Programa();
		Pelicula r = new Pelicula("Indiana Jones", "Steven Spielberg", "Aventuras", 1980);
		Pelicula q = new Pelicula("Grease", "Randal", "Musical", 1978);

		p.getLista().add(q);
		p.getLista().add(r);

		// PROGRAMA
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		boolean salir = false;
		String titulo, director, genero;
		int año;

		do {
			p.menud();
			opcion = sc.nextInt();
			switch (opcion) {

			case 1:// añadir pelicula
					// pedimos al usuario los valores para crear el objeto
				System.out.println("Titulo");
				titulo = sc.nextLine();
				sc.nextLine();
				System.out.println("Director");
				director = sc.nextLine();
				sc.nextLine();
				System.out.println("Genero");
				genero = sc.nextLine();
				sc.nextLine();
				System.out.println("año");
				año = sc.nextInt();
				// CREAMOS EL OBJETO y lo intertamos en el ARRAYLISTTTTTTTTTTTTTT
				p.getLista().add(new Pelicula(titulo, director, genero, año));
				break;
			case 2:
				break;
			case 3:// Mostrar peliculas

				for (Pelicula pel : p.getLista()) {
					System.out.println(pel.getNombre());
				}
				break;
			case 4:// Buscar por genero
				System.out.println("Que genero quieres buscar?");
				genero = sc.nextLine();
				for (Pelicula pel : p.getLista()) {
					if (pel.getGenero().equalsIgnoreCase(genero.trim())) {
						System.out.println("\t" + pel.getNombre());
					}
				}
				break;
			case 5:

				salir = true;
				break;
			}

		} while (salir = true);

	}

}
