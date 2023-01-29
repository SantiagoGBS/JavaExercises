package Actividades;

import java.util.Scanner;

public class FactorialIterativo {

	public static void main(String[] args) {
		int factorial=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n; i>=1; i--);
		factorial=factorial*i;
		System.out.println(factorial);
				

	}

}
