package ejercicio1;

public class JugadoresCampo extends jugadores {
	public String posicion;
	public int golesMarcados;
	public char[] getJugadoresCampo;

	public JugadoresCampo(int dorsal, String nombre, int tarjetasRojas, int tarjetasAmarillas, String posicion,
			int golesMarcados) {
		super(dorsal, nombre, tarjetasRojas, tarjetasAmarillas);
		this.posicion = posicion;
		this.golesMarcados = golesMarcados;
	}

	public JugadoresCampo() {
		super();
		this.posicion = "";
		this.golesMarcados = 0;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	@Override
	public String toString() {
		return "JugadoresCampo [posicion=" + posicion + ", golesMarcados=" + golesMarcados + "]";
	}

}
