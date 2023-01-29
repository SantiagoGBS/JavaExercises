import java.util.Arrays;
import java.util.Scanner;

public class ClaseRepaso {

	private static void pedirusuario() {
		// TODO Auto-generated method stub
		int c = 0;
		int ejemplo[] = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Escriba 10 numeros");
		for (int i = 0; i < ejemplo.length; i++) {
			ejemplo[i] = s.nextInt();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar variables/objetos
		int suma = 0;
		int media = 0;
		int numeroalto = 0;
		int contpares = 0;
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		// Array numeros de tamaño 10
		int ejemplo[] = new int[10];

		// Metodo para pedir al usuario 10 numeros(Array como parametro)

		pedirusuario();

		do {
			System.out.println("Elija un numero del menu");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				for (int i = 0; i < ejemplo.length; i++) {
					suma = ejemplo[0] + suma;
				}
				break;
			case 2:
				for (int i = 0; i < ejemplo.length; i++) {
					suma = ejemplo[0] + suma;
				}
				media = suma / 10;
				System.out.println("La media es " + media);
				break;
			case 3:
				Arrays.sort(ejemplo);
				break;
			case 4:
				for (int i = 0; i < ejemplo.length; i++) {

					if (ejemplo[i] > numeroalto) {
						numeroalto = ejemplo[i];
					}
				}
			case 5:
				for (int i = 0; i < ejemplo.length; i++) {

					if (ejemplo[i] % 2 == 0) {
						contpares++;
					}
				}
			case 6:
				break;
			}
		} while (menu != 6);

		// menu
		// 1. Suma de todos los elemtnos del array
		// 2. Media del array
		// 3. Minimo del array
		// 4. Maximo del array
		// 5. Numero de pares del array
		// 6. Salir

	}

}
