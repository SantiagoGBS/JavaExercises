package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Escriba un numero");
		n1=s.nextInt();
				if (n1==1) {
					System.out.println("El día de la semana es Lunes.");
				}else if (n1==2) {
					System.out.println("El día de la semana es Martes.");
					}else if (n1==3) {
						System.out.println("El día de la semana es Miercoles.");
						}else if (n1==4) {
							System.out.println("El día de la semana es Jueves.");
						}else if (n1==5) {
							System.out.println("El día de la semana es Viernes.");
							}else if (n1==6) {
								System.out.println("El día de la semana es Sabado.");
								}else if (n1==7) {
									System.out.println("El día de la semana es Domingo.");
									}else{
										System.out.println("El numero debe de estar entre el 1 y el 7.");
									}
	}

}
