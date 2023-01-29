package ClinicaRibera;

public class Profesionales extends Persona {
	protected static final int mañana = 0;
	protected static final int tarde = 1;
	protected static final int noche = 2;
	protected int turno;
	protected String especialidad;

	public Profesionales(String dNI, String nombre, String apellidos, String telefono, int turno, String especialidad) {
		super(dNI, nombre, apellidos, telefono);
		switch (turno) {
		case 0: {
			this.turno = mañana;
			break;
		}
		case 1: {
			this.turno = tarde;
			break;
		}
		case 2: {
			this.turno = noche;
			break;
		}

		}
		this.especialidad = especialidad;
	}

	public Profesionales() {

		this.turno = 0;
		this.especialidad = "";
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesionales [turno=" + turno + ", especialidad=" + especialidad + ", DNI=" + DNI + ", Nombre="
				+ Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + "]";
	}

//	public static void main(String[] args) {
//		Profesionales p1 = new Profesionales("0393928", "Juanito", "Pepito", "654545454", mañana, "Cardiologo");
//		System.out.println(p1.toString());
//	}
}
