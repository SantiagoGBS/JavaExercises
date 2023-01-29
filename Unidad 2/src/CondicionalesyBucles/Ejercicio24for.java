package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio24for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int a=0;a<(n-1);a++) {
				System.out.print(" *");
			}System.out.println(" *");
		}
	
	}

}
