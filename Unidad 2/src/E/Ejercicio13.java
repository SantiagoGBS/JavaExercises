package E;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/* 3. Escriba un programa en Java que pida un número al usuario e indique si es par o 
		impar. En Javaaso de que sea par indicar si es o no múltiplo de 3.*/
		int n=0;
		
		Scanner s=new Scanner(System.in);
		
		while(n>=0) {
			System.out.println("Escriba un  numero");
			n=s.nextInt();
			if(n%2==0) {
				System.out.println("El numero es par");
				if(n%3==0) {
					System.out.println("y este numero es multiplo de 3");
				
			}
		}else if(n%2!=0) {
			System.out.println("El numero es impar");
		}
	}

	}}
