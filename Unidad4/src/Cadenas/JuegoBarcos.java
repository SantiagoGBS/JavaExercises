package Cadenas;

import java.util.Scanner;

public class JuegoBarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String boleto = "0123456789";

		int posicion = 0;
		int intento = 0;
		int e = 0;
		String uno = "A";
		Scanner s = new Scanner(System.in);
		int cont1;
		for (int i = 0; i <= 9; i++) {
			for (int z = 0; z <= 9; z++) {
				double a = Math.random();
				if (a > 0.5) {
					uno = "A";
				} else {
					uno = "B";
				}
			}

		}

		System.out.println(boleto);
		while (intento < 6) {
			posicion = s.nextInt();
			intento++;

			if (boleto.charAt(posicion) == 'B') {
				System.out.println("Tocado");
			} else {
				System.out.println("Agua");
			}
		}

	}

}
