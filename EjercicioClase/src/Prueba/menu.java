package Prueba;

import java.util.Scanner;

public class menu {
	static void menu() {
		System.out.println("Pulse 1 para hacer el area de un cuadrado");
		System.out.println("Pulse 2 para hacer el area del circulo");
		System.out.println("Pulse 3 para hacer el area del rectangulo");
		System.out.println("Pulse 4 para salir");
		return;
	}
	static double areaCu(int l) {
		return (l*l);	
	}
	static double areaCi(int r) {
		return (Math.PI*r*r);
		
	}
	static int areaRe(int ba, int al) {
		return (ba*al);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int l=0;
		double pi=Math.PI;
		int r=0;
		int ba=0;
		int al=0;
		int ar=0;
		double rad=0;
		int la=0;
		Scanner s=new Scanner(System.in);
		do{
			menu();
			n=s.nextInt();
			switch(n) {
			
			case 1:
				
				System.out.println("Dame un lado");
				l=s.nextInt();
				la=(int) areaCu(l);
				System.out.println("El area es "+la);
				break;
			case 2:
				System.out.println("Dame el radio");
				r=s.nextInt();
				rad=areaCi(r);
				System.out.println("El radio es "+rad);
				break;
			case 3:
				System.out.println("Dame una base y una altura");
				ba=s.nextInt();
				al=s.nextInt();
				ar=areaRe(ba, al);
				System.out.println("El area es " +ar);
				break;
			case 4:
				System.out.println("Adios!");
				break;
		}
		
			
		}while(n!=4);
	}

}
