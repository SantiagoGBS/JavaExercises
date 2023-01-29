package matrices;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realizar un programa que pida al usuario las filas (mínimo 2 y máximo 10) y
	 * las columnas (mínimo 2 y máximo 10) . Suponemos que el usuario tecleará
	 * correctamente los datos. Después se rellenará esta matriz con números
	 * aleatorios del 1 al 50 y se mostrará en pantalla. Para leer el número de
	 * filas y de columnas utilizaremos la clase Scanner. La salida será similar a
	 * (recuerda que son números aleatorios, tus valores serán diferentes):
	 */
	public static void main(String[] args) {
		int filas = 0;
		int columnas = 0;
		int m[][];
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Dame un numero de filas entre 2 y 10");
			filas = s.nextInt();
			System.out.println("Dame un numero de columnas entre 2 y 10");
			columnas = s.nextInt();
		} while (filas < 2 || filas > 10 || (columnas < 2 || columnas < 10));
		// reservas memoria para la matriz
		m = new int[filas][columnas];
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = (int) (1 + Math.random() * 50);
				System.out.println("\t" + m[i][j]);
			}
		}
	}

}
