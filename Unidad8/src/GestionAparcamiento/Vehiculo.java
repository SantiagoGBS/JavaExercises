package GestionAparcamiento;

abstract public class Vehiculo implements Valida {

	public String matricula;
	public String color;
	public String marca;
	public String modelo;

	public Vehiculo(String matricula, String color, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public boolean valida(String matricula) {
		if (matricula.matches("[0-9]{4}-[A-Z]{3}")) {
			return true;
		} else
			return false;

	}

}
