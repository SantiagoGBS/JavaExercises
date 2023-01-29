package ejemplosAL;

import java.util.ArrayList;
import java.util.Arrays;

public class EjemplosAL {
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 5, 7 };

		ArrayList<Integer> numero = new ArrayList<>();
		// Añadir elementos

		int[] n2 = { 1, 2, 3, 5, 7, 6 };

		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(5);
		numero.add(7);
		numero.add(6);
		numero.add(1, 45);

		// Eliminar elementos del array
		numero.remove(1);

		// Imprimir array
		System.out.println(Arrays.toString(n));
		System.out.println(numero);

		// Operaciones (recorrer array)

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println("For each");
		for (Integer i : numero) {
			System.out.println(i);
		}
	}
}
