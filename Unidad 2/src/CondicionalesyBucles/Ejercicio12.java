package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números 
		//introducidos
		int n=1;
		int suma=0;
		Scanner s=new Scanner(System.in);
		
		while(n!=0) {
			System.out.println("Escriba un numero");
			n=s.nextInt();
			if(n==0) {
				System.out.println(suma);
			}else {
				suma=n+suma;
			}
			
		}
	}

}
