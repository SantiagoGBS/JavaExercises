package InfoRibera;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Alumno extends Personas {
	private double mediaExpediente;

	public double getMediaExpediente() {
		return mediaExpediente;
	}

	public void setMediaExpediente(double mediaExpediente) {
		this.mediaExpediente = mediaExpediente;
	}

	public Alumno(int codigo, String dNI, String nombre, String apellidos, int edad, double mediaExpediente) {
		super(codigo, dNI, nombre, apellidos, edad);
		this.mediaExpediente = mediaExpediente;
	}

	public Alumno() {
		super();
		this.mediaExpediente = 0.0;
	}

	public void cargaMediaExpediente() {
		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		try {
			ResultSet rset = bbdd.consultaBD("select avg (nota_final) from notas where cod_alumno=" + this.codigo);
			while (rset.next()) {
				this.mediaExpediente = Double.parseDouble(rset.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.setCodigo(501);
		alumno.cargaMediaExpediente();
		System.out.println(alumno.toString());
	}

	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

}
