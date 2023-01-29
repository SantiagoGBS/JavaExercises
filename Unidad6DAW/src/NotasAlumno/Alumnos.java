package NotasAlumno;

import java.util.Scanner;

public class Alumnos {
	String Nombre;
	String Apellidos;
	int edad;
	Nota[] notas;

	public Alumnos() {
		super();
		this.setNombre("");
		this.Apellidos = "";
		this.edad = 0;
		this.notas = null;
	}

	// CONSTRUCTORES PARA CREAR VARIABLES Y RESERVAR
	// MEMORIA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public Alumnos(String nombre, String apellidos, int edad) {
		super();
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.edad = edad;
		this.notas = new Nota[7]; // OBJETO ARRAY NOTAS
		for (int i = 0; i < 7; i++) {
			this.notas[i] = new Nota();
		}
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno/a " + Nombre + " " + Apellidos;

	}

	public void imprimirNotas() {
		for (int i = 0; i < this.getNotas().length; i++) {
			System.out.println(this.getNotas()[i]);
		}
	}

	public static void main(String[] arg) {
		Alumnos a = new Alumnos("Patricia", "Marquez", 18);
		System.out.print(a);
		Scanner sc = new Scanner(System.in);

	}
}
