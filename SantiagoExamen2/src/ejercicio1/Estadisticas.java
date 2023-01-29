package ejercicio1;

import java.util.ArrayList;

public class Estadisticas {

	public static void main(String[] args) {
		// creo los jugadores y porteros.

		// creo el arraylist de la clase jugadores con el nombre jugadores
		// añado los jugadores (objetos al arraylist)

		ArrayList<jugadores> jugadores = new ArrayList<>();
		jugadores.add(new JugadoresCampo(2, "pepito", 0, 0, "delantero", 1));
		jugadores.add(new JugadoresCampo(2, "juan antonio", 0, 0, "delantero", 1));
		jugadores.add(new JugadoresCampo(2, "ramiro", 0, 0, "delantero", 1));
		jugadores.add(new JugadoresCampo(2, "peedro", 0, 4, "defensa", 1));
		jugadores.add(new JugadoresCampo(2, "maria", 2, 0, "defensa", 1));
		jugadores.add(new JugadoresCampo(2, "jai su", 0, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "maria", 0, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "raul", 1, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "juanjo", 0, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "jasto", 5, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "victor", 0, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "manuel", 0, 0, "medio", 1));
		jugadores.add(new JugadoresCampo(2, "lidia", 8, 0, "medio", 1));
		// porteros
		jugadores.add(new Portero(1, "iker", 0, 0, 1));
		jugadores.add(new Portero(1, "Casillas", 1, 0, 1));
		// aqui muestro el jugador con mas rojas
		int max = 0;
		for (int i = 0; i < jugadores.size(); i++) {
			if (jugadores.get(i).getTarjetasRojas() >= max) {
				max = jugadores.get(i).getTarjetasRojas();
			}
		}
		for (jugadores i : jugadores) {
			if (i.getTarjetasRojas() == max) {
				System.out.println(i.getNombre() + " " + i.getTarjetasRojas());
			}
		}

		// compuesto
		ArrayList<jugadores> compuesto = compuesto(jugadores);
		for (jugadores i : compuesto) {
			// el que salga aqui es el compuesto
			System.out.println(i.getNombre());
		}
	}

	public static ArrayList<jugadores> compuesto(ArrayList<jugadores> jugadores) {
		// en este metodo cojo el nombre y si tiene un espacio y el nombre tiene mas de
		// 3 letras lo añado.
		// luego devuelvo compuesto, que es lo que he añadido antes
		ArrayList<jugadores> compuesto = new ArrayList<>();
		String[] nombre;
		for (jugadores i : jugadores) {
			nombre = (i.getNombre()).split(" ");
			if (nombre[0].length() > 3 && nombre.length >= 2) {
				compuesto.add(i);
			}
		}
		return compuesto;
	}

}
