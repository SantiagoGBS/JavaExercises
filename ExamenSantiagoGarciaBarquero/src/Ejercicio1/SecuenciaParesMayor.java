package Ejercicio1;

import java.util.Scanner;

public class SecuenciaParesMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int cpares = 0;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Dame un numero");
			n = s.nextInt();

			if (n % 2 == 0) {
				cpares++;
			}
			if (n % 2 != 0 && n != -1) {
				cpares = 0;
			}

		} while (n != -1);
		System.out.println("El numero maximo de pares consecutivos es de " + cpares);
	}

}
