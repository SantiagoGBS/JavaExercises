package Actividades;

import java.util.Arrays;

public class PasoParametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 3;
		intercambia(a, b);
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		int[] n = { 4, 1, 6, 5, 3, 8 };
		System.out.println(Arrays.toString(n));
		ordenaArray(n);
		System.out.println(Arrays.toString(n));
	}

	// paso de parametro por referencia direccion de memoria
	private static void ordenaArray(int[] n) {
		Arrays.sort(n);
	}

	private static void intercambia(int a, int b) {
		int aux = a;
		a = b;
		b = aux;

	}

}
