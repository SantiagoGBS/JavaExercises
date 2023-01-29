package VariablesyCondiciones;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		// Crear un programa que pida un numero y diga si es menor de 10 y multiplo de 3.
		
		int n=0;
		Scanner s=new Scanner (System.in);

		System.out.println("Escriba un numero");
		
		n=s.nextInt();
			if (n<10  & n%3==0){
				System.out.println("El numero es menor que 10 y es multiplo de 3");
			}else {
				System.out.println("El numero no cumple las condiciones");
			}
	}

}
