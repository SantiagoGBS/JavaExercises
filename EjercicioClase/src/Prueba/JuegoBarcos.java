package Prueba;

import java.util.Scanner;

public class JuegoBarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		String boleto1="AAAAAAAAAA";
		int posicion=0;
		int cont=1;
		int pos=0;
		for(int i=0; i<=9 && cont<=4; i++) {
			pos=(int) (Math.random()*2);
			if(pos==1) {
				boleto1=boleto1.substring(0,i)+'B'+boleto1.substring(i+1, boleto1.length());
				System.out.println(boleto1);
				cont++;
			}
		}
		while(!boleto1.equals("AAAAAAAAAA")) {
			System.out.println("introduce una posicion del 1 al 10: ");
			posicion=t.nextInt()-1;
			if(boleto1.charAt(posicion)=='B') {
				System.out.println("hundido");
				boleto1=boleto1.substring(0,posicion)+'A'+boleto1.substring(posicion+1,boleto1.length());
			}else {
				System.out.println("agua");
			}
			System.out.println(boleto1);
		}
	}
}

	


