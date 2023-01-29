package E;

import java.util.Scanner;

public class MyM {

	public static void main(String[] args) {
		//Mayor/menor/nocero
		int n=1;
		int aux=0;
		double au=Double.POSITIVE_INFINITY;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("Escribe un numero");
			n=s.nextInt();
			if(n<au && n!=0) {
				au=(int)n;
			}else if(n>aux) {
				aux=n;
			}
		}while(n!=0);
		System.out.println("El mayor es "+aux+" el mas pequeño es "+au);

	}

}
