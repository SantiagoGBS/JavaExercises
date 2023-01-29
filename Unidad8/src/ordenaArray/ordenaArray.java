package ordenaArray;

import java.util.Scanner;

public class ordenaArray {
	/*
	 * @autor Santiago García
	 * 
	 * @version 1.0 este es el main de la clase
	 * 
	 * @since numero-version 25/02/2022
	 */

	public static void main(String[] args) {
		int arrayNums[] = { 45, 6, 48, 72, 3 };
		int nume;
		boolean res;
		Scanner sc = new Scanner(System.in);

		System.out.println("El array antes de ser ordenado es: ");
		mostrarDatosArray(arrayNums);
		ordenarArray(arrayNums);
		System.out.println("El array ordenado es: ");
		mostrarDatosArray(arrayNums);
		System.out.println("Introduce un número para comprobar que está contenido en el array: ");
		nume = Integer.parseInt(sc.nextLine());
		res = contieneNum(arrayNums, nume);
		if (res)
			System.out.println("Has introducido un número que está contenido en el array.");
		else
			System.out.println("Has introducido un número que no está contenido en el array.");
	}

	/*
	 * LlenarDatosArray coge datos pasado por parametros para rellenarlo
	 * 
	 * @param arNum
	 */
	static void llenarDatosArray(int[] arNum) {
		Scanner inScanner = new Scanner(System.in);
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = Integer.parseInt(inScanner.nextLine());
		}
		inScanner.close();
	}

	/*
	 * Este metodo sirve para mostrar los datos del array
	 * 
	 * @param arNum
	 */
	static void mostrarDatosArray(int arNum[]) {
		for (int i = 0; i < arNum.length; i++) {
			if (i == (arNum.length - 1))
				System.out.print(arNum[i]);
			else
				System.out.print(arNum[i] + " -- ");
		}
		System.out.println();
	}

	/*
	 * 
	 * Si N esta en en el array el boolean se vuelve true y se sale del metodo. Si
	 * no, comprueba todas las posiciones del array hasta que se acabe. Si no esta,
	 * devuelve false.
	 * 
	 * @param arNum
	 * 
	 * @param n
	 * 
	 * @return esta== true // false
	 */
	static boolean contieneNum(int arNum[], int n) {
		boolean esta = false;
		int i = 0;

		do {
			if (arNum[i] == n)
				esta = true;
			else
				i++;
		} while ((!esta) && (i < arNum.length));

		return esta;
	}

	/*
	 * Ordena de menor a mayor el array (arNum).
	 * 
	 * @param arNum
	 * 
	 */
	static void ordenarArray(int arNum[]) {
		int aux;
		for (int j = 0; j < arNum.length; j++) {
			for (int i = 0; i < arNum.length; i++) {
				if ((i < (arNum.length - 1)) && (arNum[i] > arNum[i + 1])) {
					aux = arNum[i];
					arNum[i] = arNum[i + 1];
					arNum[i + 1] = aux;
				}
			}
		}
	}

	/*
	 * Ordena el array llamado arNum, lo guarda y lo devuelve en el return.
	 * 
	 * @param arNum
	 * 
	 * @return arNum (ya ordenado)
	 */
	static int[] ordenarArray2(int arNum[]) {
		int aux;
		for (int j = 0; j < arNum.length; j++) {
			for (int i = 0; i < arNum.length; i++) {
				if ((i < (arNum.length - 1)) && (arNum[i] > arNum[i + 1])) {
					aux = arNum[i];
					arNum[i] = arNum[i + 1];
					arNum[i + 1] = aux;
				}
			}
		}

		return arNum;
	}
}
