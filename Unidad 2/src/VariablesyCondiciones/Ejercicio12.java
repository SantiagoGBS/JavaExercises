package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;

		
		Scanner s=new Scanner (System.in);
		System.out.println("Escriba su nota");
		
		n1=s.nextInt();
		if(n1==9 || n1==10){
			System.out.println("Sobresaliente");
		}else if(n1==8 || n1==7){
				System.out.println("Notable");
			}else if(n1==6){
					System.out.println("Bien");
				}else if(n1==5){
							System.out.println("Aprobado");
					}else if(n1==0 || n1 <4){
									System.out.println("Suspenso");
						}else {
						System.out.println("Introduzca un numero valido.");
	}}

}
