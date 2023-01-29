package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {
	static int boleto1[] = new int[5];
	static int boleto2[] = new int[5];

	private static int[] getBoleto(int[] boleto1) {
		// TODO Auto-generated method stub
		int boleto[] = new int[5];
		for (int i = 0; i < boleto.length; i++) {
			boleto[i] = (int) (1 + Math.random() * 20);

		}
		System.out.println(Arrays.toString(boleto));

		return boleto;
	}

	private static String getAlias(String alias) {
		int alea = (int) (Math.random() * 100);
		alias = "j" + alias.substring(0, 3) + alea;

		return alias;
	}

	private static void imprimeJugador() {
		String j1 = "";
		String j2 = "";
		/*
		 * int boleto1[] = new int[5]; int boleto2[] = new int[5];
		 */
		boleto1 = getBoleto(boleto1);
		boleto2 = getBoleto(boleto2);
		System.out.println("Jugador 1, escriba su nombre");
		Scanner s = new Scanner(System.in);
		j1 = s.next();
		System.out.println("Jugador 2, escriba su nombre");
		Scanner a = new Scanner(System.in);
		j2 = a.next();
		j1 = getAlias(j1);
		j2 = getAlias(j2);
		System.out.println("Jugador 1, tu alias es " + j1 + " y tu boleto es el " + Arrays.toString(boleto1));
		System.out.println("Jugador 2, tu alias es " + j2 + " y tu boleto es el " + Arrays.toString(boleto2));

	}

	public static void main(String[] args) {
		/*
		 * Crea una clase Bingo.java con las siguientes variables y objetos: • 2 cadenas
		 * que guardan el nombre de los jugadores • 2 arrays de enteros de tamaño 5
		 * llamado boleto1 y boleto2. Crea los siguientes métodos: • getBoleto() :
		 * Inicializa las 5 posiciones del array con números aleatorios entre 1 y 20.
		 * •getAlias(): Devuelve una cadena del alias del jugador estará formado por la
		 * letra J seguido de las 3 primeras letras del nombre y luego un numero
		 * aleatorio entre 0 y 100. Por ejemplo, si el jugador se llama Juan su alias
		 * sería: JJua62 • imprimeJugador() imprime por pantalla: El juego comienza
		 * pidiendo los nombres de los dos jugadores por teclado y mostrando los alias y
		 * los boletos de cada jugador. Se saca una bola de la urna, a continuación, se
		 * busca ese número en los boletos de los 2 jugadores. Si está, este número se
		 * sustituye por el número 0 en los boletos de manera que gana el jugador que
		 * consiga encontrar todos sus números..
		 */
		int cont1 = 0;
		int cont2 = 0;
		int bola;
		String j1 = "";
		String j2 = "";

		imprimeJugador();

		do {
			bola = (int) (1 + Math.random() * 20);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Sale el numero " + bola);
			for (int i = 0; i < 5; i++) {
				if (bola == boleto1[i]) {
					boleto1[i] = 0;
					cont1++;
					System.out.println("Jugador 1 tiene el numero!!" + Arrays.toString(boleto1));
				}
			}
			for (int i = 0; i < 5; i++) {
				if (bola == boleto2[i]) {
					boleto2[i] = 0;
					cont2++;
					System.out.println("Jugador 2 tiene el numero!!" + Arrays.toString(boleto2));
				}
			}
			for (int i = 0; i < 5; i++) {

			}

		} while (cont1 != 5 && cont2 != 5);
		if (cont1 == cont2) {
			System.out.println("Felicidades, habeis empatado.");
		}
		if (cont1 > cont2) {
			System.out.println("Felicidades, el jugador 1 ha ganado");
		}
		if (cont2 > cont1) {
			System.out.println("Felicidades, el jugador 2 ha ganado");
		}
	}

}
