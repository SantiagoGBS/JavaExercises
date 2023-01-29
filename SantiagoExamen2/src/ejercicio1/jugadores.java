package ejercicio1;

public class jugadores {
	public int dorsal;
	public String nombre;
	public int tarjetasRojas;
	public int tarjetasAmarillas;

	public jugadores(int dorsal, String nombre, int tarjetasRojas, int tarjetasAmarillas) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public jugadores() {
		super();
		this.dorsal = 0;
		this.nombre = "";
		this.tarjetasRojas = 0;
		this.tarjetasAmarillas = 0;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	@Override
	public String toString() {
		return "jugadores [dorsal=" + dorsal + ", nombre=" + nombre + ", tarjetasRojas=" + tarjetasRojas
				+ ", tarjetasAmarillas=" + tarjetasAmarillas + "]";
	}

}
