package Prueba;

import java.util.Scanner;

public class EjercicioAboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int c=0;
		int suma=0;
		int aux=0;
		boolean a=true;
		Scanner s=new Scanner(System.in);
		while(n!=3) {
			n=s.nextInt();
			if(n%2==0) {
				c++;
			}
			else if(n%2!=0 & n<3) {
				suma=suma+n;
			}
			if(a=true) {
				aux=n;
			}
			a=false;
		}if(aux%2!=0) {
			System.out.println("pares "+c);
		}else
			System.out.println("suma es "+suma);
		
	}

}
