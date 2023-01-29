package barcos;

public class boleto {
	private char b[];
	private int longitud;

	public boleto(int longitud) {
		super();
		this.longitud = longitud;
		this.b = new char[6];
	}

	public char[] rellenarBoleto() {
		for (int i = 0; i < b.length; i++) {
			for (int e = 1; e < 6; e++) {
				char hueco = 'C';
				double alea = Math.random();
				if (alea > 0.5) {
					hueco = 'A';
				} else {
					hueco = 'B';
				}
				b[i] = hueco;
			}
		}
		return b;
	}

	public void imprimirBoleto() {
		System.out.println(b);
	}
}
