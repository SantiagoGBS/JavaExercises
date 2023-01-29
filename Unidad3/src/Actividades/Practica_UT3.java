package Actividades;

import java.util.*;
	

public class Practica_UT3 {
	static boolean filtro(int n1, int n2){
		boolean filtro;
		
		if (n1>0 & n2>0 & n1!=n2) {
			filtro=true;
			
		}
		else {
			filtro=false;
		}
		return filtro;
		
	}
	
	
	static void menu() {
	System.out.println("a) ¿Son numeros amigos?");
	System.out.println("b) ¿Cuantos primos hay entre ambos?");
	System.out.println("c) Imprimir las cifras del numero A");
	System.out.println("d) Sumar las cifras de b");
	System.out.println("e) Salir");
		
			return;
	}
	static boolean Numerosamigos(int n1,int n2) {
		int c=0;
		int c2=0;
		int divisor=0;
		int suma=0;
		int suma2=0;
		boolean amigos=false;
		do{
			c++;
			c2++;
			if(n1%c==0) {
				suma=suma+c;
				
			}if(n2%c2==0) {
				suma2=suma2+c;
			}if(suma==n2 & suma2==n1) {
				amigos=true;
			}
			
			
		}while(c!=n1-1);
		return (amigos);
		
	}
	static int Numerosprimos(int n1, int n2) {
		int c=0;
		int cpri=0;
		int divi=0;
		for(int i=n1;i<n2;i++) {

			for(int a=1;a<=n2;a++) {
				if(i%a==0) {
					divi++;
				}
			}if(divi==2) {
					cpri++;
				}divi=0;
			
		}
		return cpri;
		
	}static String CifrasA(int n) {
		{
			int numero=0;
			String aux=" ";
			do {
				
				numero=n%10;
				if(numero!=0) {
					aux=numero+aux;
				}
				
				n=n/10;
				
			}while(numero!=0);
			return(aux);
			}
		
	}static int CifrasB(int n) {
		int suma=0;
		int aux=0;
		while(n>0) {
			
			aux=(n%10);
			suma=suma+aux;
			n=n/10;
			
		}System.out.println(suma);
		return suma;
		
	}

	public static void main(String[] args) {
		boolean filtro=true;
		int n1=0;
		int n2=0;
		int npri=0;
		String CifraA="";
		String opcion="";
		int CifraB=0;
		boolean resultado=true;
		Scanner s=new Scanner(System.in);
		do {
		System.out.println("Dame dos numeros enteros, positivos y diferentes");	
		n1=s.nextInt();
		n2=s.nextInt();
		filtro(n1, n2);
		menu();
		opcion=s.next();
			switch(opcion) {
			
			case "a":
				resultado=Numerosamigos(n1,n2);
				if(resultado==true) {
					System.out.println("Los numeros son amigos");
				}else {
					System.out.println("Los numeros NO son amigos");
				}
				break;
			case "b":
				npri = Numerosprimos(n1,n2);
				System.out.println(npri);
				break;
			case "c":
				CifraA=CifrasA(n1);
				
					System.out.println(CifraA);
				break;
			case "d":
				CifraB= CifrasB(n1);
				
				System.out.println();
				break;
			
			case "e":
					filtro=false;
					System.out.println("Adios!");
				break;
				
			}
		
		
		}while(filtro==true);
		

	}

}
