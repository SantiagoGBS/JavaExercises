package matrices;

import java.util.Arrays;

public class getBoleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boleto[] = new int[5];
		for (int i = 0; i < boleto.length; i++) {
			boleto[i] = (int) (1 + Math.random() * 20);
			;
		}
		System.out.println(Arrays.toString(boleto));
	}

}
