package Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] jugador1 = new String[5];
		int contadorplus = 0;
		int[] resultado1 = new int[5];
		int[] resultado2 = new int[5];
		int contador = 0;
		int dado = 0;
		Scanner s = new Scanner(System.in);
		String j1 = "";
		String j2 = "";
		int cont1 = 0;
		int cont2 = 0;
		// he intentado comparar numero y mayus con posiciones de j1 convertido en un
		// array
		// con un j1.CharArray pero no he sabido hacerlo. Imagino que luego era comparar
		// las posiciones desde la 0 a la 4 y luego, aparte comparar la 5.
		// Luego poner un booleano para que hasta que no se cumpla, no salga del bucle y
		// siga pidiendo los nicks.
		int[] numero = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] mayus = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q",
				"R", "S", "T", "U", "W", "X", "Y", "Z" };
		System.out.println("Jugador 1, introduzca su nick");
		j1 = s.next();

		System.out.println("Jugador 2, introduzca su nick");
		j2 = s.next();

		// Aqui genero los dados del primer jugador
		for (int a = 0; a < resultado1.length; a++) {
			resultado1[a] = (int) (1 + Math.random() * 6);
			// aqui genero los dados del segundo jugador
		}
		for (int e = 0; e < resultado1.length; e++) {
			resultado2[e] = (int) (1 + Math.random() * 6);

		}
		System.out.println("El jugador 1 tiene " + Arrays.toString(resultado1));
		System.out.println("El jugador 2 tiene" + Arrays.toString(resultado2));
		System.out.println("\n**********Comieza el juego**********");
		while (contador < 5) {
			contadorplus = contador + 1;
			dado = (int) (1 + Math.random() * 6);
			System.out.println("Dado: " + dado);

			if (dado == resultado1[contador]) {
				cont1++;
				System.out.println("Jugador 1 coincide con el resultado de lanzamiento " + contadorplus);

			}

			if (dado == resultado2[contador]) {
				cont2++;
				System.out.println("Jugador 2 coincide con el resultado de lanzamiento " + contadorplus);
			}
			contador++;
		}
		if (cont1 > cont2) {
			System.out.println("El jugador 1 ha ganado");
		}
		if (cont2 > cont1) {
			System.out.println("El jugador 2 ha ganado");
		}
		if (cont2 == cont1) {
			System.out.println("Los jugadores han empatado.");
		}

	}

}
