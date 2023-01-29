package PRUEBexamen;

import java.util.Scanner;

public class EXA1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1 Crea un programa Java en el que el usuario introduce números
		 * hasta que se pulsa el número 0. Para cada uno de los números introducidos
		 * calcula: 1) El número de cifras 2) La suma de sus cifras 3) ¿Cuántas cifras
		 * son pares y cuántas impares? Cuando el programa termina indica qué número de
		 * todos los introducidos ha sido el mayor y cuál el menor (no es el cero)
		 */
		int n = 1;
		int cont = 0;
		int suma = 0;
		int par = 0;
		int impar = 0;
		int c = 0;
		int nalt = 0;
		int nbaj = 0;
		int nn = 0;
		boolean bandera = false;

		do {
			System.out.println("Para salir del programa pulse el 0");
			Scanner s = new Scanner(System.in);
			n = s.nextInt();
			nn = n;
			if (n == 0) {
				bandera = true;
			} else {

				par = 0;
				impar = 0;
				cont = 0;
				suma = 0;
				if (n > 0 && n > nalt) {
					nalt = n;
				}
				if (nbaj < n && n != 0) {
					nbaj = nbaj;
				}
				for (int i = 0; n > 0; i++) {
					c = n % 10;
					n = n / 10;
					suma = suma + c;
					if (c % 2 == 0) {
						par++;
					} else {
						impar++;
					}
					cont++;
				}
				System.out.println("Tiene " + cont + " cifras");
				System.out.println("Hay " + par + " cifras pares y " + impar + " cifras impares");
				System.out.println("La suma de sus cifras es " + suma);
			}

		} while (bandera != true);
		System.out.println("El numero mas alto es el " + nalt);
		System.out.println("El numero mas bajo es el " + nbaj);
	}

}
