package Actividades;

import java.util.Scanner;

public class FactorialRecursivo {

	public static void main(String[] args) {
		int factorial=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n; i>=1; i--);{
			
		}
		factorial=factorial*i;
		System.out.println(factorial);
				

	}
	private static int factorial(int n) {
		//caso base
		if(n==1) 
			return 1;
			else
			return n*factorial(n-1);
	
	}
}
