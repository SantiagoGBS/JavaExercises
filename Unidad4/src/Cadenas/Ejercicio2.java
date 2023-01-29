package Cadenas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Recorrer un String
		String palabra="";
			Scanner s=new Scanner(System.in);
			System.out.println("Dame una palabra");
			palabra=s.next();
			for(int i=palabra.length()-1;i>=0;i--) {
				System.out.print(palabra.charAt(i));
			}

}
}