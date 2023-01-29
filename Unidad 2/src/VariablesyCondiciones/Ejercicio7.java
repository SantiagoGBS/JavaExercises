package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Coger dos numeros e indicar cual es mayor. 
		//Declararclases/objetos___formulas___desarrollo
		
		int num1=0;
		int num2=0;
		
		Scanner s=new Scanner (System.in);
		
		System.out.println("Indique un numero");
		
		num1=s.nextInt();
		
		System.out.println("Indique un segundo numero");
		
		num2=s.nextInt();
		if (num1>num2) {
			System.out.println("El numero "+num1 +" es mayor");
			
		} else{
			System.out.println("El numero "+num2 +" es mayor");
		}
	}

}
