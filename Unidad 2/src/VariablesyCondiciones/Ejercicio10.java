package VariablesyCondiciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//pedir 3 numeros y ordenarlos de menor a mayor
		//declarar variables/clases**formulas***desarrollo
		int n1=0;
		int n2=0;
		int n3=0;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Escriba el primer numero");
		
		n1=s.nextInt();
		
		System.out.println("Escriba el segundo numero");
		
		n2=s.nextInt();
		
		System.out.println("Escriba el tercer numero");
				
		n3=s.nextInt();
		
		 if (n1<n2 & n2<n3){
			System.out.println("Los numeros ordenados son: " +n1 +n2 +n3);
			}
		
			else if(n1<n2 & n2>n3){
				System.out.println("Los numeros ordenados son " +n1 +n3 +n2);
			}
		
				else if (n2<n3 & n1>n3) {
					System.out.println("Los numeros ordenados son " +n2 +n3 +n1);
				}
					else if (n2<n3 & n1<n3) {
						System.out.println("Los numeros ordenados son " +n2 +n1 +n3);
					}
						else if (n3<n1 & n2>n1) {
							System.out.println("Los numeros ordenados son " +n3 +n1 +n2);
							
								}else if (n3<n1 & n2<n1) {
									System.out.println("Los numeros ordenados son " +n3 +n2 +n1);
								}}}
		
			
				