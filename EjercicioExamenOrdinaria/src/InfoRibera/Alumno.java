package InfoRibera;

import java.sql.ResultSet;

public class Alumno extends Personas {
	private double mediaExpediente = 0.0;

	public Alumno(int codigo, String dNI, String nombre, String apellidos, int edad) {
		super(codigo, dNI, nombre, apellidos, edad);
		this.mediaExpediente = mediaExpediente;
	}

	public double getMediaExpediente() {
		return mediaExpediente;
	}

	public void setMediaExpediente(double mediaExpediente) {
		this.mediaExpediente = mediaExpediente;
	}

	public double cargaMediaExpediente() {
//		posteriormente a esta consulta se podra consultar el expediente del 
//		alumno a traves del getter publico:
		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		int contador = 0;
		double suma = 0;
		try {
			ResultSet rset = bbdd.consultaBD("select n.nota_final from notas where cod_alumno= " + this.codigo);
			while (rset.next()) {
				suma = rset.getDouble(1);
				contador++;

			}

			bbdd.cerrarConsulta();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (double) suma / contador;

	}

	public double mediaExpediente() {
		return mediaExpediente;

	}

	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

	public static void main(String[] args) {

	}

}
