package OrdenacionesBusquedas;

import java.util.Arrays;

public class BusquedaBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[] = { 5, 7, 8, 1, 29, 4, 87, 65, 11, 10 };
		System.out.println("Burbuja");
		System.out.println(Arrays.toString(vector));
		burbuja(vector);

	}

	private static void burbuja(int[] vector) {
		// TODO Auto-generated method stub
		int aux = 0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}
	}

}
