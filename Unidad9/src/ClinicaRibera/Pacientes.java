package ClinicaRibera;

import java.io.File;
import java.io.PrintWriter;

public class Pacientes extends Persona {

	protected float peso;
	protected int edad;
	protected String cita; // relaciona paciente-profesional
	protected String historia;

	public Pacientes(String dNI, String nombre, String apellidos, String telefono, float peso, int edad, String cita) {
		super(dNI, nombre, apellidos, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = "";
	}

	public Pacientes() {

		this.peso = 0;
		this.edad = 0;
		this.cita = "";
		this.historia = "";
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "Pacientes [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historia=" + historia + ", DNI="
				+ DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + "]";
	}

	public void GuardarHistorial(String HistoriaNueva) {
		PrintWriter salida = null;
		File fichero = new File("Historia" + this.DNI + ".txt");
		try {
			salida = new PrintWriter(fichero);
			if (!this.historia.equals("")) {
				salida.println("\n" + this.historia);
				salida.println("\n" + HistoriaNueva);
			} else
				salida.println(HistoriaNueva);
			salida.flush();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error en escritura guardarhistorial");
		}

	}

//	public static void main(String[] args) {
//		Pacientes p = new Pacientes("03939848", "Juanito", "Perez", "6434343", (float) 34.56, 45, "");
//		p.GuardarHistorial("Alergia asasas alta");
//	}

}
