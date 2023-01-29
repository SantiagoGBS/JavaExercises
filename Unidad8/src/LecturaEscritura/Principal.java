package LecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Coche> coches = new ArrayList<>();
		File fichero = new File("BDCoches.csv");
		try {
			String cadena = "";// Toda la linea del fichero
			String[] linea;
			Scanner entrada = new Scanner(fichero);
			// saltar linea
			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				System.out.println(cadena);
				linea = cadena.split(";");
				coches.add(new Coche(linea[0], linea[1], linea[2], Double.parseDouble(linea[3])));
			}

			System.out.println(coches);
			double mayor = 0;
			String marca = "";
			for (Coche c : coches) {
				if (c.getPrecio() > mayor) {
					mayor = c.getPrecio();
					marca = c.getMarca();
				}
				System.out.println("El " + marca + " el mas caro " + mayor);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
