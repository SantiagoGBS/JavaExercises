package matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = new int[3][4];// 3 filas y 4 columnas
		int cont = 1;
		for (int i = 0; i < m.length; i++) {// 3 que va de 0 a 2
			for (int j = 0; j < m[0].length; j++) { // 4 va de 0 a 3
				m[i][j] = cont;
				cont++;
			}
		}
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(("\t") + m[i][j]);
			}
		}

	}

}
