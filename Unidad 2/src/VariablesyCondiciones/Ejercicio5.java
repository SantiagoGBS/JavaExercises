package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Pide un numero por teclado y dice si es negativo, positivo o cero
		//Declarar variables/objetos, procesar datos, mostrar datos
	float num=0;

	System.out.println("Dime un numero");
	Scanner n=new Scanner (System.in);
	num=n.nextFloat();
	
	if(num>0) {
	System.out.println("El numero es positivo");

	}else if(num<0) {
		System.out.println("El numero es negativo");
		
	}else if(num==0){
		System.out.println("El numero es igual a 0");
		
	}
	n.close();
}}
