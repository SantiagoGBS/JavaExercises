package Matricula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	public ArrayList notas = new ArrayList();

	public void cargarnotas() {
		File fichero = new File("matricula.csv");
		try {
			String cadena = "";
			String[] linea = null;
			int codigo = 0;
			Scanner entrada = new Scanner(fichero);
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.split(";");
				codigo = Integer.parseInt((linea)[2]);
				if (codigo == this.getCodigo()) {
					this.notas.add(new notas );
					nota = new Nota(Integer.parseInt(cadena[0]),cadena[1], Integer.parseInt(cadena[2]),Integer.parseInt(cadena[3]));
					System.out.println(nota.toString());
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Alumno(int codigo, String dNI, String nombre, String apellidos) {
		super(codigo, dNI, nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	public Alumno(int codigo, String dNI, String nombre, String apellidos, ArrayList notas) {
		super(codigo, dNI, nombre, apellidos);
		this.notas = notas;
	}

	public ArrayList getNotas() {
		return notas;
	}

	public void setNotas(ArrayList notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [notas=" + notas + "]";
	}

}
