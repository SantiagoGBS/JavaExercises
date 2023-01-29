package Prueba;

import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		/*Crea un programa que lea números enteros desde teclado hasta que introduce un 0. Si el 
			primer número introducido es mayor o igual a 2 muestra el número de impares que se han 
			introducido por teclado. Si el primer número es menor a 2 muestra la suma de los pares 
			mayores que 5.
			*/ 
			int n=0;
			int c=0;
			int aux=0;
			int ci=0;
			int suma=0;
			Scanner s=new Scanner(System.in);
			do {
				System.out.println("Dame un numero");
				n=s.nextInt();
				c++;
				if(c==1) {
					aux=n;
				}if(n%2!=0) {
					ci++;
				}else if(n%2==0 & n<5) {
					suma=suma+n;
				}
	
				
			}while(n!=0);
			if(aux>=2) {
				System.out.println("Se han metido impares " +ci);
			}else {
				System.out.println("La suma es "+suma);
	}
	}
}
