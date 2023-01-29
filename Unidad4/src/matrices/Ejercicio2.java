package matrices;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realizar un programa que pida al usuario las filas (m�nimo 2 y m�ximo 10) y
	 * las columnas (m�nimo 2 y m�ximo 10) . Suponemos que el usuario teclear�
	 * correctamente los datos. Despu�s se rellenar� esta matriz con n�meros
	 * aleatorios del 1 al 50 y se mostrar� en pantalla. Para leer el n�mero de
	 * filas y de columnas utilizaremos la clase Scanner. La salida ser� similar a
	 * (recuerda que son n�meros aleatorios, tus valores ser�n diferentes):
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
