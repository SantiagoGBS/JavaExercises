package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la 
		cantidad de alumnos mayores de 18 a�os, y la cantidad de alumnos que miden m�s de 
		1.75.
		*/
		int i=0;//contador
		float e=0f;//ESTATURA alumno
		int a=0;//edad alumno
		float n=0f;//suma edad
		int suma=0;
		int ma=0;//suma
		int me=0; //media edad Alumno
		float m=0f;//media ESTATURA
		int mi=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Indique la edad y la estatura del alumno");
		while(i<5) {
			a=s.nextInt();
			e=s.nextFloat();
			ma=ma+a;
			
			n=e+n;
			
			
			if(a>18) {
				suma=1+suma;
			}
			if(e>1.75) {
				mi=mi+1;
				
			}
			
			i++;
			
		}me=ma/5;
		m=n/5;
		System.out.println("Hay "+suma+" mayores de edad y la media de edad es " +me);
		System.out.println("Hay "+mi + " alumnos mayores de 1.75 y la media es "+m);
	}}
