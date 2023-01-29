package Examenprog;

public class administrador extends usuario {
	protected int turno;

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public administrador(String dNI, String nombre, String apellidos, String direccion, String usuario, String clave,
			int turno) {
		super();
		this.turno = turno;
	}

}
