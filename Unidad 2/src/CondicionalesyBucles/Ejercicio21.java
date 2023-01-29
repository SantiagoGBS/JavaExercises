package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		//Pedir 10 números, y mostrar al final si se ha introducido alguno negativo
		int n=0;
		int i=0;
		int suma=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Escribe 10 numeros");
		
		
		while(i<10) {
			n=s.nextInt();
			i++;
			if(n<0) {
				suma=suma+1;
				
				
			}
			
		}System.out.println("Se han introducido "+suma+" numeros negativos");
	}

}
