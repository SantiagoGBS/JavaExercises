package Actividades;

import java.util.*;

public class Ejemplo {
	
	public static int suma(int a, int b) {
		System.out.println("Este metodo es la suma de "+a+"+"+b);
		return(a+b);
	}
	public static int resta(int n1, int n2) {
		// TODO Auto-generated method stub
		return(n1-n2);
	}
	
	public static void main(String[] args) {
		// Declaracion de variables/objetos
		int numero1=0;
		int numero2=0;
		int resultado=0;
		
			Scanner s=new Scanner(System.in);
			System.out.println("Dame dos numeros");
			numero1=s.nextInt();
			numero2=s.nextInt();
			
			//procesamiento de datos
			
		resultado=suma(numero1,numero2);
			System.out.println(resultado);
		resultado=resta(numero1,numero2);
		System.out.println(resultado);

	}


	

}
