package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		//22. Pedir 5 números e indicar si alguno es múltiplo de 3
		int i=0;
		int n=0;
		int suma=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Escribe 5 numeros");
		
		while(i<5) {
			n=s.nextInt();
			if(n%3==0) {
				suma=suma+1;
			}
			i++;
			
			
		}System.out.println("Hay "+suma+" numeros multiplos de 3");

	}

}
