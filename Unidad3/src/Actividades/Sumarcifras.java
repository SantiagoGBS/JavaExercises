package Actividades;

import java.util.Scanner;

public class Sumarcifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int suma=0;
		int aux=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0) {
			
			aux=(n%10);
			suma=suma+aux;
			n=n/10;
			
		}System.out.println(suma);
	}

}
