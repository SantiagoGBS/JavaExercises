package GestionAparcamiento;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aparcamiento {
	ArrayList<Conductor> conductores;

	public void LeerConductores(String file) {
		File fichero = new File(file);
		String[] conductor;
		try {
			Scanner entrada = new Scanner(fichero);
			entrada.nextLine();
			while (entrada.hasNext()) {
				conductor = (entrada.nextLine()).split(";");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Conductor c = new Conductor(null, null, null, 0, null, null, 0, 1);
		System.out.println(c.getTurno());
	}
}
