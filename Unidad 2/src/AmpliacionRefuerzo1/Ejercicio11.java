package AmpliacionRefuerzo1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*11. Escriba un programa en Java que solicite al usuario n�meros positivos de tres o m�s 
cifras y compruebe si son pares. Si el n�mero introducido es positivo pero de una o dos 
cifras, se solicitar� un nuevo n�mero. El programa finaliza cuando se introduce �0� o un 
n�mero negativo*/
		int n=0;
		int i=0;
		Scanner s=new Scanner(System.in);
		
		do {
			do{
				System.out.println("Dame un numero");
				n=s.nextInt();
			}while(n<=99 && n>0);
			
			if(n%2==0 && n>99) {
				System.out.println("El numero "+n +" es par");
			}
		}while(n!=0 && n>0);
			System.out.println("Programa finalizado");
	
	}

}
