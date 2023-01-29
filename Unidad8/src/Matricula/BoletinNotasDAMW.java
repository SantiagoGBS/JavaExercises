package Matricula;

import java.io.IOException;
import java.util.ArrayList;

public class BoletinNotasDAMW {
	private ArrayList<Alumno> dam;

	public BoletinNotasDAMW() {
		dam = new ArrayList<>();
	}

	public void cargaInicial() throws IOException {

	}

	public ArrayList<Alumno> getDam() {
		return dam;
	}

	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}

	public void generarBoletines() {

	}

	public static void main(String[] args) throws IOException {

	}

}
