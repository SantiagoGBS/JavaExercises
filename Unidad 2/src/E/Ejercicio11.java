package E;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*1. Escriba un programa que lea un número entero y escriba un mensaje si el número es 
		mayor que 100*/
		int n=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Escriba un numero");
		n=s.nextInt();
		while(n>0) {
			System.out.println("Escriba un numero");
			n=s.nextInt();
			if(n>100) {
				System.out.println("Feliciades, es un numero");
			}
		}
		
		
	}

}
