package FrutasRibera;

public class Empleado extends Persona {
	public int turno;

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public Empleado(String dni, String nombre, String apellidos, String direccion, int turno) {
		super(dni, nombre, apellidos, direccion);
		this.turno = turno;
	}

	public Empleado() {
		super();
		this.turno = 0;
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + "]";
	}

}
