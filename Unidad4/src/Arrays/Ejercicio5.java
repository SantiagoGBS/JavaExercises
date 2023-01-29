package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int bloque1[] = new int[5];
		for (int i = 0; i < bloque1.length; i++) {

			System.out.println("Dame un numero");
			bloque1[i] = s.nextInt();
		}
		Arrays.sort(bloque1);
		System.out.println(Arrays.toString(bloque1));
	}

}
