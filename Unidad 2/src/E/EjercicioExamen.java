package E;

import java.util.Scanner;

public class EjercicioExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int a=1;
		int i=0;
		int suma=0;
		int conpa=0;
		int conim=0;
		int ma=0;
		int mi=(int)Double.POSITIVE_INFINITY;
		
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("Dame una cifra");
			a=s.nextInt();
			n=a;
			while(n!=0) {
				i++;
				if(n>ma) {
					ma=n;
				}else if(n<mi && n!=0){
					mi=n;
				}
				if(n%2==0) {
					conpa++;
				}else {
					conim++;
				}
				suma=suma+n%10;
				n=n/10;
				
			}
			System.out.println("Las cifras son "+i+" y su suma es "+suma);
			System.out.println("Hay "+conpa+" pares y "+conim+" impares");
			
			
		}while(a!=0);
		System.out.println("El numero mas pequeño es  "+mi+" y el mas grande es "+ma);
	}

}
