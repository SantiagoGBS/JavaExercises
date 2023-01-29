package VariablesyCondiciones;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Escriba un numero");
		n1=s.nextInt();
		
		switch (n1) {
		case 1: n1=1;
		System.out.println("Enero");
		break;
		case 2: n1=2;
		System.out.println("Febrero");
		break;
		case 3: n1=3;
		System.out.println("Marzo");
		break;
		case 4: n1=4;
		System.out.println("Abril");
		break;
		case 5: n1=5;
		System.out.println("Mayi");
		break;
		case 6: n1=6;
		System.out.println("Junio");
		break;
		case 7: n1=7;
		System.out.println("Julio");
		break;
		case 8: n1=8;
		System.out.println("Agosto");
		break;
		case 9: n1=9;
		System.out.println("Septiembre");
		break;
		case 10: n1=10;
		System.out.println("Octubre");
		break;
		case 11: n1=11;
		System.out.println("Noviembre");
		break;
		case 12: n1=12;
		System.out.println("Diciembre");
		break;
		default: 
			System.out.println("Dia invalido");
			
		}
	}

}
