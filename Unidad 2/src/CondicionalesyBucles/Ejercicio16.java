package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//16. Pedir 15 números y escribir la suma total.
		Scanner s=new Scanner(System.in);
		int n=0;
		int contador=0;
		int suma=0;
		
		while(contador<15) {
			System.out.println("Escriba un numero");
			n=s.nextInt();
			contador++;
			suma=suma+n;
			if (contador==15) {
				System.out.println(suma);
			}
			
			
		}
	}

}
