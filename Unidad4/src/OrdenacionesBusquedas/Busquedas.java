package OrdenacionesBusquedas;

import java.util.Arrays;
import java.util.Scanner;

public class Busquedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion = 0;
		int numero = 0;
		int vector[] = { 3, 56, 65, 22, 9, 1, 3, 7, 2, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		numero = sc.nextInt();
		posicion = busquedaLineal(numero, vector);
		System.out.println("El elemento esta en la posicion " + posicion);
		Arrays.sort(vector);
		posicion = BusquedaDicotomica(numero, vector);
		System.out.println("El elemento esta en la posicion " + posicion);
	}

	private static int BusquedaDicotomica(int numero, int[] vector) {
		int l = 0;
		int h = vector.length - 1;
		int m = 0;
		int posicion = 0;

		while (posicion != numero) {

			m = (l + h) / 2;

		}

		return 0;
	}

	private static int busquedaLineal(int numero, int[] vector) {
		// TODO Auto-generated method stub
		int posicion = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == numero) {
				posicion = i;
			}
		}

		return posicion;
	}

}
