package LecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaLectura {

	public static void main(String[] args) {
		File fichero = new File("datos.txt");
		String cadena = "";
		Scanner entrada = null;
		int suma = 0;
		try {
			entrada = new Scanner(fichero);

			while (entrada.hasNext()) {
				cadena = entrada.next();
				System.out.println(cadena + " ");
				suma += Integer.parseInt(cadena);// PASA A ENTERO UN STRING
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		entrada.close();
	}

}
