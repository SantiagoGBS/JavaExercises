package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Pedir dos numeros y mostrarlos de menor a mayor
		//Declararvariables/objetos_formulas/desarrollar
		
		int num1=0;
		int num2=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Indique un numero");
		
		num1=s.nextInt();
		
		System.out.println("Indique un segundo numero");
		
		num2=s.nextInt();
		
	    if(num1>num2){
		System.out.println(+num2 +" < " +num1 );
		
	}else{
		System.out.println(+num1+" > "+num2);
}}}
