package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio14for {

	public static void main(String[] args) {
		// Pedir un número N, y mostrar todos los números del 1 al N
		
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Escriba un numero");
		n=s.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
