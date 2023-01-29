package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pide dos numeros y dice si uno es multiplo de otro
		
		//Declarar variables/objetos/realizarformulas/declarar datos
		
		float num1=0;
		float num2=0;
		
		Scanner s= new Scanner (System.in);
		
		System.out.println("Indique un número");
		
		num1=s.nextInt();
		
		System.out.println("Indique un segundo número");
		
		num2=s.nextInt();
		
		if(num1%num2==0)
			System.out.println("Los numeros son multiplos");

		 else if(num1%num2==0) 
			
			System.out.println("Los numeros son multiplos");
	
		 else 
			System.out.println("Tus numeros no son multiplos.");
		
			

}
}