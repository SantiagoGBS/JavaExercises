package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		//Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€
		Scanner s=new Scanner(System.in);
		int n=0;
		int suma=0;
		int c=0;
		
		System.out.println("Escriba 10 sueldos");
		for(int i=0;i<10;i++) {
			
			n=s.nextInt();
			suma=suma+n;
			if(n>1000) {
				c++;
			}
			
			
		}			System.out.println("La suma total de los sueldos es de " +suma+" y hay " +c +" sueldos mas grandes de 1000");

	}

}
