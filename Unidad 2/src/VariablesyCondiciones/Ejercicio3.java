package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Este programa calcula la longitud de una circunferencia
		
		//declaracion de objetos y variables
		
		double radio=0;
		double longitud=0;
		double pi=Math.PI;
		Scanner t=new Scanner (System.in);
		
		//procesamiento de datos
		
		System.out.println("Dime el radio de tu circunferencia");
		radio=t.nextDouble();
		longitud=(radio* 2)*pi;
		System.out.println("Su longitud es "+longitud);
		
				
		
		

	}

}
