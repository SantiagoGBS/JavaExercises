package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		//Pedir números hasta que se introduzca uno negativo, y calcular la media.
		int n=1;
		int suma=0;
		int contador=0;
		int m=0;
		
		Scanner s=new Scanner(System.in);
		
		while(n>0 || n==0) {
			System.out.println("Escriba un numero");
			n=s.nextInt();
			contador++;
			if(n>0) {
				suma=suma+n;
				
			}else {
				System.out.println("La media es");
				m=suma/contador;
				System.out.println(m);
				
			}
		}
	}

}
