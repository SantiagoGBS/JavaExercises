package Actividades;

import java.util.Scanner;

public class Imprimir_Cifras {

	public static void main(String[] args) {
		int n=0;
		int numero=0;
		String aux=" ";
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		do {
			
			numero=n%10;
			if(numero!=0) {
				aux=numero+aux;
			}
			
			n=n/10;
			
		}while(numero!=0);
		System.out.println(aux);
	}

}
