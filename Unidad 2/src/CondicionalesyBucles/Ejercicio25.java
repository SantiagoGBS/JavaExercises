package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		int cont=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1; i<=n;i++) {
			cont=0;
			for(int a=1;a<=i;a++) {
				if(i%a==0) {	
					cont++;
				}
			}
			if(cont==2) {
				System.out.println(i+ " Es primo");
			}
		}

	}

}
