import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alea = 0;
		int us = 0;
		int cont = 0;
		Scanner s = new Scanner(System.in);
		int[] boleto = new int[20];
		for (int i = 0; i < boleto.length; i++) {
			alea = (int) (+1 + Math.random() * 25);
			boleto[i] = alea;
		}
		System.out.println("Dame un numero");
		us = s.nextInt();
		for (int e = 0; e < boleto.length; e++) {
			if (boleto[e] == us) {
				System.out.println("Se ha encontrado el valor en la posicion " + e);
				cont++;
			}
		}
		System.out.println("Se repite " + cont + " veces");
		System.out.println("Los numeros generados son " + Arrays.toString(boleto));

	}

}
