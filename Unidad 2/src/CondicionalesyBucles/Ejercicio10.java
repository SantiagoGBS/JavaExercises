package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han 
		//introducido.
		Scanner s=new Scanner(System.in);
		int n=1;
		int contador=0;
		
		while(n>=0) {
			System.out.println("Escribe un numero");
			n=s.nextInt();
			contador++;
			
	}
		System.out.println(contador);
	}

}
