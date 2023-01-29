package LecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Correo {

	private String nombreCompleto;
	private String correo;

	public Correo(String nombreCompleto, String correo) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.correo = correo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Correo [nombreCompleto=" + nombreCompleto + ", correo=" + correo + "]";
	}

	// METODO para Leer fichero de Alumnos
	public static ArrayList<String> LeerAlumnos() {

		File fichero = new File("AlumnosDAW.csv");
		try {
			Scanner entrada = new Scanner(fichero);
			// NOS SALTAMOS LAS 5 PRIMERAS LINEAS
			entrada.nextLine();
			entrada.nextLine();
			entrada.nextLine();
			entrada.nextLine();
			entrada.nextLine();
			String cadena = "";
			String[] linea;
			String subcadena = "";
			String nombrecompleto = "";
			String email = "";
			PrintWriter salida = new PrintWriter("adiosssssss.txt");
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				// System.out.println(cadena);
				linea = cadena.split(";");
				// Nombrecompleto

				// System.out.println(linea[0]);

				String[] parte = cadena.split(" ");
				String parte1 = parte[0];
				String parte2 = parte[1];
				String parte3 = parte[2];
				nombrecompleto = parte[2] + parte[0];
				String replace = nombrecompleto.replace(';', ' ').replace('1', ' ').replace('º', ' ').replace(',', ' ')
						.replace(" ", "");
				nombrecompleto = replace;

				// System.out.println(email);
				for (int i = 0; i < nombrecompleto.length(); i++) {
					if (nombrecompleto.charAt(i) == 'á') {
						nombrecompleto = nombrecompleto.replace('á', 'a');
					}
					if (nombrecompleto.charAt(i) == 'é') {
						nombrecompleto = nombrecompleto.replace('é', 'e');
					}
					if (nombrecompleto.charAt(i) == 'í') {
						nombrecompleto = nombrecompleto.replace('í', 'i');
					}
					if (nombrecompleto.charAt(i) == 'ó') {
						nombrecompleto = nombrecompleto.replace('ó', 'o');
					}
					if (nombrecompleto.charAt(i) == 'ú') {
						nombrecompleto = nombrecompleto.replace('ú', 'u');
					}
				}
				email = "daw1_" + nombrecompleto.toLowerCase() + "@riberadeltajo.es";
				salida.println(email);

			}
			salida.flush();
			salida.close();
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		LeerAlumnos();
	}
}
