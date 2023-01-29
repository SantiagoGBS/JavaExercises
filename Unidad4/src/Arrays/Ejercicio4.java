package Arrays;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bloque1[] = new int[5];
		int bloque2[] = new int[1];
		int alea = 0;
		bloque1[0] = (int) Math.round(+1 + Math.random() * 5);
		for (int i = 1; i < bloque1.length; i++) {
			alea = (int) Math.round(+1 + Math.random() * 5);
			bloque1[i] = alea;
			for (int e = 0; e < bloque1.length; e++) {
				if (bloque1[e] == bloque1[i]) {
					bloque1[i] = (int) Math.round(+1 + Math.random() * 5);
				}
			}

		}

		System.out.println(Arrays.toString(bloque1));

		for (int e = 0; e < bloque2.length; e++) {
			bloque2[e] = (int) (+1 + Math.random() * 9);
		}
		System.out.println(Arrays.toString(bloque2));
	}

}
