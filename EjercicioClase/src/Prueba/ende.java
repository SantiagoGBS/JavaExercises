package Prueba;

import java.util.Scanner;

public class ende {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//pedimos el numero
		int n = scan.nextInt();
		//en resultado iremos añadiendo lineas para ir imprimiendo el proceso
		String resultado = "";
		/*iniciamos un bucle si es while o do while hay que crear un contador e incrementar en 1 en cada vuelta
		 * mientras que el contador sea menor o igual al numero dara vueltas*/
		for(int i = 0; i <= n; i++ ) {
			//comprobamos si i vale 0 tenemos que poner 1 ya que todo numero elevado a 0 es 1
			if(i==0)
				resultado+=1;
			else {
				//en caso de que no sea 0 añadiremos a resultado xn
				resultado+="x"+n;
			}
			System.out.println(n+" elevado a "+i+ " es: " +resultado);
			
		}

	}

}
