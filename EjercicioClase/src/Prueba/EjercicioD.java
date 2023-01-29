package Prueba;

import java.util.Scanner;

public class EjercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int c=0;
		int suma=0;
		int sumai=0;
		int aux=0;
		boolean a=true;
		Scanner s=new Scanner(System.in);
		while(n!=-1) {
			System.out.println("Dame un numero");
			n=s.nextInt();
			if(a=true) {
				aux=n;
			}
			if(n<10) {
				suma=suma+n;
			}
			else if(n%2!=0 & n<6) {
				sumai=sumai+n;
			}
			
			a=false;
		}if(aux%3==0) {
			System.out.println("suma es "+suma);
		}else
			System.out.println("suma es "+suma);
		
	}

}
