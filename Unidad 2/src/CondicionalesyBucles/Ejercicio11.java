package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/* 
		 
			Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han 
			introducido.
			
		 */
		int n=0;
		double ram=Math.random();
		int alea=(int)(ram*20+1);
		
		Scanner s=new Scanner(System.in);
		
		while(n!=alea) {
			System.out.println("Escriba un numero"+alea);
			n=s.nextInt();
			if(n>alea) {
				System.out.println("El numero es mayor");
			}else if (n<alea) {
				System.out.println("El numero es menor");
			}else {
				System.out.println("Felicidades, has acertado!");
			}
		}
		
	}

}
