package CondicionalesyBucles;

public class Ejercicio17 {

	public static void main(String[] args) {
		//17. Diseñar un programa que muestre el producto de los 10 primeros números impares.
		int n=1;
		int ant=0;
		int pro=1;
		
		while(ant<10) {
			if(n%2!=0) {
				pro=pro*n;
				
				ant++;
			}n++;
		}System.out.println(pro);
		

	}

}
