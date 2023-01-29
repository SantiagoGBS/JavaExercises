package ejemplosAL;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private int nPuertas;

	public Coche(String matricula, String marca, String modelo, int nPuertas) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.nPuertas = nPuertas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", nPuertas=" + nPuertas
				+ "]";
	}

}
