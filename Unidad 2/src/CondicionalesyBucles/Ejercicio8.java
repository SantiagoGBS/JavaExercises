package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se 
		//introduzca un 0
		int n=1;
		Scanner s=new Scanner (System.in);
		
		while(n!=0) {
			System.out.println("Escriba un numero");
			n=s.nextInt();
			if (n==0){
				System.out.println("El numero es 0");
				break;
			}
			else if(n<0) {
				System.out.println("El numero es negativo");
			}else {
				System.out.println("El numero es positivo");
			}
		}
	}

}
