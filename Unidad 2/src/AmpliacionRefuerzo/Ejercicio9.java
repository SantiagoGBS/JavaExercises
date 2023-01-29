package AmpliacionRefuerzo;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int suma=0;
		int m=0;
		int i=0;
		int ma=0;
		int me=0;
		System.out.println("Escriba 10 numeros enteros positivos");
		Scanner s=new Scanner(System.in);
		
		while(i<10){
			n=s.nextInt();
			suma=n+suma;
			if(n>ma) {
				ma=n;
			}else if() {
				
			}
			i++;
		}
		m=suma/i;
		System.out.println("La suma es "+suma+" y la media es "+m+" el mayor es "+ma);
		
		
	}

}
