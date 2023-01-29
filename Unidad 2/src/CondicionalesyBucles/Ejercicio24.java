package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		//24. Dibuja un cuadrado de n elementos de lado utilizando *.
		int n=2;
		int c=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		
		while(c<n){
			for(int i=1;i<(n+1);i++) {
				System.out.print("*");
				
				//if(i==n) {
				//	System.out.print("\n*");
				//}
				}System.out.print("\n");
				//for(int a=0;a<(n);a++) {
					System.out.print("*");
					//if(a==n) {
					//	System.out.print("\n*");
					//}
				//}
				c++;
		}
		
		}
			
		}


