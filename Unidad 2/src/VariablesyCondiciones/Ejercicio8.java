package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//coger2num y decir si son iguales o cual es mayor
		//declarar/variables/clases__formulas____desarrollo
		
		float num1=0;
		float num2=0;
		
		Scanner s=new Scanner (System.in);
		System.out.println("Escriba un numero");
		
		num1=s.nextInt();
		
		System.out.println("Escriba otro numero");
		
		num2=s.nextInt();
		
		if(num1>num2) {
			System.out.println("El numero "+num1+" es mayor que" +num2);
		}
		else if(num2>num1) {
			System.out.println("El numero "+num2+" es mayor que "+num1);
		}else if(num2==num1) {
			System.out.println("Los numeros son iguales. ");
		}
		
	}

}
