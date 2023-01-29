package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		for (int n = 1; n<=100; n++ ) {
			if (n%5==0) {
				System.out.println(+n);
			}
			//else {
				//System.out.println("El numero " +n +" No es multiplo");
			//}
			
		}
		
	}

}
