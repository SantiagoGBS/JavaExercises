package Actividades;

import java.util.Scanner;

public class Ejercicio4 {

	static void menu() {
		System.out.println("Pulse 1 para hacer la suma");
		System.out.println("Pulse 2 para hacer la resta");
		System.out.println("Pulse 3 para hacer la multiplicacion");
		System.out.println("Pulse 4 para hacer la division");
		System.out.println("Pulse 5 para salir");
		return;
	}
	static int suma(int a, int b) {
		return (a+b);	
	}
	static int resta(int a, int b) {
		return (a-b);
		
	}
	static int multi(int a, int b) {
		int suma=0;
		int c=0;
		while(c<b) {
			suma=suma+a;
			c++;
		}return (suma);}
		
	static int div(int a, int b) {
		int c=0;
		while(a>=b) {
			c++;
			a=a-b;	
		}return (c);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int a=0;
		int b=0;
		int resultado=0;
		Scanner s=new Scanner(System.in);
		do{
			System.out.println("Dame dos numeros");
			a=s.nextInt();
			b=s.nextInt();
			menu();
			n=s.nextInt();
			switch(n) {
			
			case 1:
				resultado=(int) suma(a, b);
				System.out.println("La suma es "+resultado);
				break;
			case 2:
				resultado=resta(a,b);
				System.out.println("La resta es "+resultado);
				break;
			case 3:
				resultado=multi(a,b);
				System.out.println("la multiplicacion es " +resultado);
				break;
			case 4:
				resultado=div(a,b);
				System.out.println("la division es " +resultado);
				break;
			case 5:
				System.out.println("Adios!");
				break;
		}
		
			
		}while(n!=5);
	}


}





