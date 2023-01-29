package DueñosVehiculos;

public class NIF {
	char Letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
			'L', 'C', 'K', 'E' };
	public static final int DIMENSION_MAX = 9;
	public static final int DIVISOR = 23;
	String numeronif;

	public NIF(String nif) {
		setNIF(nif);
	}

	public void setNIF(String nif) {
		if (escorrecto(nif)) {
			numeronif = nif;
			System.out.println("NIF correcto");
		} else
			throw new IllegalArgumentException("NIF no valido");

	}

	public boolean escorrecto(String nif) {
		boolean correcto = true;

		if (nif.length() == 9) {
			if (Character.isLetter(nif.charAt(nif.length() - 1))) {
				System.out.println("El ultimo es una letra");
				for (int i = 0; i < nif.length() - 2; i++) {
					if (!Character.isDigit(nif.charAt(i)))
						correcto = false;
				}
			} else
				correcto = false;

		} else
			correcto = false;

		int numero = Integer.parseInt(nif.substring(0, 8));
		System.out.println("El numero del nif es: " + numero);
		if (Letras[numero % 23] == nif.charAt(nif.length() - 1)) {
			System.out.println("La letra es correcta");
		} else {

			System.out.println("La letra no es correcta");
			correcto = false;
		}

		if (correcto)
			System.out.println("El nif es correcto");
		else
			System.out.println("El nif no es correcto");

		return correcto;

	}

	@Override
	public String toString() {
		return "NIF [" + numeronif + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NIF dni = new NIF("02320251B");
		System.out.println(dni);
	}
}