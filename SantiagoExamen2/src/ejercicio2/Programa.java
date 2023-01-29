package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
//	private ArrayList<Alumno> alumnos;
	private ArrayList<Alumno> daw;
	private ArrayList<Alumno> dam;

	public Programa() {
		this.daw = new ArrayList();
		this.dam = new ArrayList();
		;
	}

	public ArrayList<Alumno> getDaw() {
		return daw;
	}

	public void setDaw(ArrayList<Alumno> daw) {
		this.daw = daw;
	}

	public ArrayList<Alumno> getDam() {
		return dam;
	}

	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}

	@Override
	public String toString() {
		return "Programa [daw=" + daw + ", dam=" + dam + "]";
	}

	public void leerFicheroCSV(String filename) {

		File CSV = new File(filename);
		try {
			String[] espacio;
			Scanner sc = new Scanner(CSV);
			sc.nextLine();
			while (sc.hasNext()) {
				espacio = sc.nextLine().split(";");
				if (espacio[4].equalsIgnoreCase(" daw")) {
					this.daw.add(new Alumno(Integer.parseInt(espacio[0]), espacio[1], espacio[2],
							Double.parseDouble(espacio[3]), espacio[4]));
				} else
					this.dam.add(new Alumno(Integer.parseInt(espacio[0]), espacio[1], espacio[2],
							Double.parseDouble(espacio[3]), espacio[4]));

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en ficheros alumno");
		}

	}

	public static double media(ArrayList<Alumno> daw) {
		double avg = 0;
		for (int i = 0; i < daw.size(); i++) {
			avg += daw.get(i).getNotaMedia();
		}
		avg = avg / daw.size();
		return avg;

	}

	public void escritura(String filename) {
		PrintWriter salida = null;
		File fichero = new File(filename);
		double media = media(this.daw);
		// creo objeto filename. For each y escribe en un fichero siempre y cuando sea
		// mayor que la media
		try {
			salida = new PrintWriter(fichero);
			for (Alumno i : this.daw) {
				if (i.getNotaMedia() > media)
					salida.println(i.getCodigo() + ";" + i.getNombre() + ";" + i.getApellido() + ";" + i.getNotaMedia()
							+ ";" + i.getCurso());
			}
			salida.flush();
		} catch (FileNotFoundException e) {
			// Error en escritura
			System.out.println("Error en escritura media alumnos daw");
		}
	}

	public static void main(String[] args) {
		// creo objeto llamado programa y llamo a los tres metodos.
		Programa programa = new Programa();
		programa.leerFicheroCSV("alumnos.csv");
		programa.escritura("daw.csv");
		programa.media(programa.getDaw());

	}

}
