package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//. Pedir un n�mero N, y mostrar todos los n�meros del 1 al N
		Scanner s=new Scanner(System.in);
		
		int contador=0;
		int n=0;
		System.out.println("Escribe un numero");
		n=s.nextInt();
		
		
		while (contador!=n) {
			contador++;
			
			System.out.println(contador);
			
			
		}
	}

}
