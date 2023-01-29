package NotasAlumno;

import java.util.Scanner;

public class Programa extends Alumnos {
	public static void main(String[] args) {
		System.out.println("1.-Alta alumnos " + "\n 2.-Asignar notas" + "\n 3.-Numeros de suspensos"
				+ "\n 4.-Nota media de cada alumno");
		Scanner s = new Scanner(System.in);
		int menu = 0;
		menu = s.nextInt();
		Alumnos a = new Alumnos("", "", 0);
		Nota[] n = new Nota[7];
		do {
			switch (menu) {
			case 1:
				System.out.println("Escriba un nombre");
				a.setNombre(s.next());
				System.out.println("Escriba un apellido");
				a.setApellidos(s.next());
				System.out.println("Escriba una edad");
				a.setEdad(s.nextInt());
				break;
			case 2:
				for (int i = 0; i < 7; i++) {
					System.out.println("Modulo");
					n[i].setModulo(null);
					System.out.println("Nota");
				}

				break;
			case 3:
				break;
			case 4:
				break;
			}
		} while (menu != 5);

	}
}
