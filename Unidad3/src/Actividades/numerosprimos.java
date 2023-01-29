package Actividades;

import java.util.Scanner;

public class numerosprimos {

	public static void main(String[] args) {
		int n1=0;
		int c=0;
		int n2=0;
		int cpri=0;
		int divi=0;
		
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		for(int i=n1;i<n2;i++) {

			for(int a=1;a<=n2;a++) {
				if(i%a==0) {
					divi++;
				}
			}if(divi==2) {
					cpri++;
				}divi=0;
			
		}System.out.print(cpri);
	}
}
