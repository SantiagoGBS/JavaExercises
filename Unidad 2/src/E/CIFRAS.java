package E;

import java.util.Scanner;

public class CIFRAS {

	public static void main(String[] args) {
		//CIFRAS
		int n=123;
		int suma=0;
		int i=0;
		Scanner s=new Scanner(System.in);
		while(n!=0) {
			i++;
			System.out.println("El resto es "+n%10);
			suma=suma+n%10;
			n=n/10;
			System.out.println("El cociente es " +n);
			
		}System.out.println("la suma de las cifras es " +suma);
		System.out.println("Las cifras son " +i);
	
	}

}
