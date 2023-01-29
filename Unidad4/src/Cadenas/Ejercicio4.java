package Cadenas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String variable ="";
		Scanner s=new Scanner(System.in);
		System.out.println("Dame una palabra");
		String cadena=s.next();
		for(int i=cadena.length()-1;i>=0;i--) {
			variable+=cadena.charAt(i);
		}
		if(cadena.equals(variable)) {
			System.out.print("Es un palindromo");
		}
		else {
			System.out.println("No es un palindromo");
		}
	}

}
