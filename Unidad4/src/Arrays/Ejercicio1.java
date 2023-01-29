package Arrays;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alea = (int) Math.random() * 20;
		int numeros[] = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (1 + Math.random() * 50);
		}
		System.out.println(Arrays.toString(numeros));
	}

}
