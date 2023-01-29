package GestionAparcamiento;

public class Conductor extends Persona {
	public int Codigo;

	private enum Turnos {
		MA�ANA, TARDE, NOCHE
	}

	private Turnos turno;

	public Conductor(String dNI, String nombre, String apellidos, int edad, String direcci�n, String email, int codigo,
			int turno) {
		super(dNI, nombre, apellidos, edad, direcci�n, email);
		Codigo = codigo;
		this.turno = setTurno(turno);
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public Turnos getTurno() {
		return turno;
	}

	public Turnos setTurno(int turno) {
		if (turno == 1) {
			this.turno = Turnos.MA�ANA;
		} else if (turno == 2) {
			this.turno = Turnos.TARDE;
		} else if (turno == 3) {
			this.turno = Turnos.NOCHE;
		}
		return this.turno;
	}

	@Override
	public String toString() {
		return "Conductor [Codigo=" + Codigo + ", turno=" + turno + "]";
	}

}
