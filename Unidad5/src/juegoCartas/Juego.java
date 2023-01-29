package juegoCartas;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Carta c = new Carta(); c.setNumero(2); c.setPalo("bastos");
		 * System.out.println(c); }
		 * 
		 * // El numero sea 1-7 o 10,11,12 (aleatorio) // Palo sea bastos, copas,
		 * espadas, oros (aleatorio) public void extraerCarta() { int n = 0; do { n =
		 * (int) (1 + Math.random() * 12); } while (n == 8 || n == 9); this.numero = n;
		 * }
		 */
		Jugador j1 = new Jugador();
		j1.setNombre("Juan");
		System.out.println(j1);

	}
}
