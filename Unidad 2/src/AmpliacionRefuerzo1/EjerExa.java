package AmpliacionRefuerzo1;

import java.util.Scanner;

public class EjerExa {

	public static void main(String[] args) {
		// saca las cifras de un numero y sumalas
		
	int n=0;
	int suma=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Escribe un numero");
	n=s.nextInt();
	
	while(n!=0) {
		suma=suma+n%10;
		n=n%10;
	}System.out.println("La suma de las cifras es "+suma);

	}

}
