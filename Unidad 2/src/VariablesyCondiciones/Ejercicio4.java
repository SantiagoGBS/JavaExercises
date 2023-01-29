package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declarar+procesar+mostrar datos
      int num1=0;
      int num2=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Escriba un numero");
      
      num1=s.nextInt();
      
      System.out.println("Escriba otro numero");
      
      num2=s.nextInt();
      
      if(num1==num2){
    	  System.out.println("Los numeros "+num1 +num2+ " son iguales");
      }else {
    	  System.out.println("Los numeros "+num1 +num2 + " no son iguales");
      }
	}

}
