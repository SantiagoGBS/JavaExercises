package Arrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		Scanner s = new Scanner(System.in);
		int numeros[] = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (1 + Math.random() * 25);

		}
		System.out.println("Dame un numero");
		numero = s.nextInt();
		for (int d = 0; d < numeros.length; d++) {

		}
	}

}
