package PracticaUT6;

import java.util.Arrays;

public class App implements PracticaUT6 {

	public App() {

	}

	@Override
	// FUNCIONNNNNNN
	public int[] sumaColumnasMatriz(int[][] m) {
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			for (int a = 0; a < m.length; a++) {
				array[i] += m[a][i];
			}
		}
		return ((array));
	}

	@Override
	public int secuenciaMayor() {
		// Rellenar array
		/*
		 * for (int i = 0; i < array.length; i++) { for (int a = 0; a < array.length;
		 * a++) { int alea = (int) (1 + Math.random() * 10); array[a] = alea; } }
		 */
		/////////
		int[] array = new int[] { 1, 1, 1, 4, 4, 1, 1 };
		int aux = array[0];
		int maximo = 0;
		int cont = 1;
		for (int i = 1; i < array.length; i++) {
			if (aux == array[i]) {
				cont++;
			} else {
				cont = 0;
			}
			if (cont >= maximo) {
				maximo = cont;
			}
			aux = array[i];
		}
		return maximo;
	}

	@Override
	public int mediaImparesDesdePrimerPar() {
		// TODO Auto-generated method stub
		int[] array = new int[] { 3, 5, 2, 3, 7, 4, 5 };
		int suma = 0;
		int media = 0;
		int cont = 0;
		int contador = 0;
		int par = 0;
		while (contador < 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 != 0) {
					suma = suma + array[i];
					cont++;
					media = suma / cont;
				} else {
					par++;
				}
				if (array[i] % 2 == 0 && par < 2) {
					suma = 0;
					cont = 0;
				}

			}
			contador++;
		}
		return media;
	}

	public static void main(String[] args) {
		App objeto = new App();
		// ARAAY PARA PRUEBA
		int[][] matriz1 = new int[3][4];
		for (int i = 0; i < matriz1.length; i++) {
			for (int a = 0; a < matriz1[i].length; a++) {
				matriz1[i][a] = i + a;
			}

			// objeto.sumaColumnasMatriz(matriz1);

		}
		System.out.println(
				"Las columnas sumadas dan el siguiente array: " + Arrays.toString(objeto.sumaColumnasMatriz(matriz1)));
		System.out.println("El máximo de veces que ha salido un mismo numero seguido es " + objeto.secuenciaMayor());
		System.out.println("La media de impares desde el primer impar es: " + objeto.mediaImparesDesdePrimerPar());
	}
}
