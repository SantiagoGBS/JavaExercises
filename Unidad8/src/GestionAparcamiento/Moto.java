package GestionAparcamiento;

public class Moto extends Vehiculo {
	private String tipo;
	private int cilindrada;

	public Moto(String matricula, String color, String marca, String modelo, String tipo, int cilindrada,
			String carnet) {
		super(matricula, color, marca, modelo);
		this.tipo = tipo;
		this.cilindrada = cilindrada;
		this.carnet = carnet;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Override
	public String toString() {
		return "Moto [tipo=" + tipo + ", cilindrada=" + cilindrada + ", carnet=" + carnet + "]";
	}

	private String carnet;

//	public static void main(String[] args) {
//		Moto n = new Moto();
//		if (n.valida("1234-AbC")) {
//			System.out.println("Esta bien");
//		} else
//			System.out.println("Esta mal");
//	}

}
