package E;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int c=0;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		while(n!=0) {
			
			n=n/10;
			c++;
		}System.out.println(c);
		
	}

}
