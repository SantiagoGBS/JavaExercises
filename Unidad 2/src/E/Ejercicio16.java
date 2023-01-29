package E;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int a=0;
		int b=0;
		int i=0;
		int c=0;
		do {
			Scanner s=new Scanner(System.in);
			System.out.println("Indique 3 numeros de una cifra cada uno ");
			n=s.nextInt();
			a=s.nextInt();
			b=s.nextInt();
			if(n==1 && a==2 && b==3) {
				System.out.println("Acceso permitido");
				i++;
			}else {
				System.out.println("Contraseña incorrecta");
				c++;
		
			}
		}while(i!=1 && c<3);
	}

}
