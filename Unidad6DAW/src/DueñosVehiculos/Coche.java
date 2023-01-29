package DueñosVehiculos;

public class Coche extends Vehiculo {
	String modelo;
	String color;
	int numeroPuertas;

	public Coche(String matricula, String marca, String modelo, String modelo2, String color, int numeroPuertas) {
		super(matricula, marca, modelo);
		modelo = modelo2;
		this.color = color;
		this.numeroPuertas = numeroPuertas;
	}

	public Coche(String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		modelo = "";
		this.color = "";
		this.numeroPuertas = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color + ", numeroPuertas=" + numeroPuertas + ", matricula="
				+ matricula + ", marca=" + marca + "]";
	}

}
