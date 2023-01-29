package Cadenas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contA=0;
		int contE=0;
		String palabra="";
		
		Scanner s=new Scanner(System.in);
		palabra=s.next();
		for(int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i)=='e' || palabra.charAt(i)=='a') {
				contA++;
			}
		}System.out.println("Han aparecido un total de " +contA);
		
	}

}
