package VariablesyCondiciones;

import java.util.Scanner;

public class practicaclase1 {

	public static void main(String[] args) {
		// Hacer un menu 
		int n1=0;
		int n2=0;
		int op=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Escriba un numero");
		n1=s.nextInt();
		System.out.println("Escriba otro numero");
		n2=s.nextInt();
		System.out.println("Elija una opcion");
		System.out.println("1-Suma 2-Resta 3-Producto 4-Division 5-Resto");
		op=s.nextInt();
		
		switch (op) {
			case 1: op=1;
			
			System.out.println((n1+n2));
			break;
			
			case 2: op=1;
			System.out.println((n1-n2));
			break;
			
			case 3: op=1;
			System.out.println((n1*n2));
			break;
			
			case 4: op=1;
			System.out.println((n1/n2));
			break;
			case 5: op=1;
			System.out.println((n1%n2));
			break;
			default:
				System.out.println("No has elegido una operacion valida");
		
			
		}
	}


}
