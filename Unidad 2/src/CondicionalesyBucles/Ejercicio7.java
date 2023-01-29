package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Escriba un programa en Java que muestre en pantalla los números enteros del 1 al 
		//100 de 2 en 2. 
		int n=1;
		Scanner s=new Scanner (System.in);
		
		while (n>0) {
			System.out.println("Escriba un numero");
			n=s.nextInt();
			if (n<0) {
				System.out.println("El numero es negativo");
				break;
			}else {
				System.out.println(Math.pow(n, 2));
			}
			
		}
		
	}

}
