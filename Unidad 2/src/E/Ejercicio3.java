package E;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Indique el dinero que va a depositar y el interes");
		a=s.nextInt();
		b=s.nextInt();
		c=b*a;
		c=c/100;
		c=a+c;
		System.out.println("El dinero generado es "+c);
	}

}
