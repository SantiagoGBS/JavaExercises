package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		//Pedir 10 números. Mostrar la media de los números positivos, la media de los números 
		//negativos y la cantidad de ceros
		int n=1;
		int i=1;
		int suma=0;
		int m=0;
		int a=0;
		int b=0;
		int me=0;
		int c=0;
		int d=0;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Escriba 10 numeros");
		
		while(i<11) {
			n=s.nextInt();
			if (n>0) {
				d++;
				suma=n+suma;
				m=(suma/d);
				
			}
			
			else if(n==0) {
				a++;
			}else if (n<0){
				c++;
				b=n+b;
				me=b/c;
				
				
			}i++;
		}
		System.out.println("La media es "+m);
		System.out.println("Hay  "+a+" ceros");
		System.out.println("La media negativa es "+me);
		
	}

}
