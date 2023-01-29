package DueñosVehiculos;

public class Moto {

	double cilindrada;

	public Moto(double cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	public Moto() {
		super();
		this.cilindrada = 0;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}

}
