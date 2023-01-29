package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
		// Calcular el area de un rectangulo donde el usuario 
		//nos dice la base y la altura (float)
		
		//declarar variables/objetos
		
		double area=0;
		double base=0;
		double altura=0;
		Scanner teclado=new Scanner (System.in);
		//procesamiento
		
		System.out.println("Indique la base del rectangulo");
		base=teclado.nextInt();
		System.out.println("Indique la altura del rectangulo");
		altura=teclado.nextInt();
		area=base*altura;
		System.out.println("El resultado es "+area);
		
		//mostrar datos
		
		

	}

}
