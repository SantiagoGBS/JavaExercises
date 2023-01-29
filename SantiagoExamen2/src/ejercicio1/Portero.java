package ejercicio1;

public class Portero extends jugadores {
	public int golesEncajados;

	public Portero(int dorsal, String nombre, int tarjetasRojas, int tarjetasAmarillas, int golesEncajados) {
		super(dorsal, nombre, tarjetasRojas, tarjetasAmarillas);
		this.golesEncajados = golesEncajados;
	}

	public Portero() {
		super();
		this.golesEncajados = 0;
	}

	public int getGolesEncajados() {
		return golesEncajados;
	}

	public void setGolesEncajados(int golesEncajados) {
		this.golesEncajados = golesEncajados;
	}

	@Override
	public String toString() {
		return "Portero [golesEncajados=" + golesEncajados + "]";
	}

}
