package LecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pruebanotas {
	public static void main(String[] args) {
		File fichero = new File("notas.csv");
		try {
			Scanner entrada = new Scanner(fichero);
			String cadena = "";
			String[] linea;
			Double suma = 0.0;
			while (entrada.hasNext())
				cadena = entrada.nextLine();
			suma = 0.0;
			linea = cadena.split(";");
			System.out.println("El alumno/a:");
			System.out.println("\t" + linea[0]);
			for (int i = 1; i < linea.length; i++) {
				suma += Integer.parseInt(linea[i]);
			}
			System.out.println("\t" + linea[0] + " nota media " + suma / 4);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
