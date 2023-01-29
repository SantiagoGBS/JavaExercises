package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio2 {
	

 public static void main(String[] args) {
	//Este programa calcula el area de un circulo dado el radio por teclado
	 
	 //declaracion e inicializacion de variables/objetos
	 double area=0;
	 int radio=0;
	 Scanner teclado=new Scanner (System.in);
	 
	 //procesamiento
	 
	 System.out.println("Dame un valor para el radio");
	 radio=teclado.nextInt();
	 area=Math.PI*Math.pow(radio, 2);
	 
	 //Imprimir resultados
	 
	 System.out.println("El area del circulo es "+radio+area);
}
	}