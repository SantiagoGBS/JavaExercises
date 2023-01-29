package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declarar+procesar+mostrar
		
		double a=0;
		double b=0;
		double c=0;
		double r1=0;
		double r2=0;
		
		Scanner s=new Scanner (System.in);
		System.out.println("Indique el valor de a");
		a=s.nextDouble();
		System.out.println("Indique el valor de b");
		b=s.nextDouble();
		System.out.println("Indique el valor de c");
		c=s.nextDouble();
		r1=(-b +Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		r2=(-b -Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		System.out.println("El valor positivo es "+r1);
		System.out.println("El valor negativo es "+r2);
	}

}
