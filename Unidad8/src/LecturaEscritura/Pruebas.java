package LecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		File fichero = new File("datos.txt");
		try {
			PrintWriter salida = new PrintWriter(fichero);
			Scanner sc = new Scanner(System.in);
			int numero = 0;
			do {
				System.out.println("Dame un numero");
				numero = sc.nextInt();
				salida.print
				salida.print(numero);
			} while (numero != 0);
			salida.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}