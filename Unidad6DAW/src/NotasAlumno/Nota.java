package NotasAlumno;

public class Nota {
	String modulo;
	double nota;

	// Contructor por defecto
	public Nota() {
		this.setModulo("");
		this.setNota(0.0);
	}

	// Constructor con parametros
	public Nota(String modulo, double nota) {
		super();
		this.modulo = modulo;
		this.nota = nota;
	}

	// Getters y setters
	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	// Imprime objeto
	@Override
	public String toString() {
		return "Nota [modulo=" + modulo + ", nota=" + nota + "]";
	}

	public void asignarNota(String modulo, double nota) {
		this.setModulo(modulo);
		this.setNota(nota);
	}

	public static void main(String[] args) {
		Nota n = new Nota("Programacion", 8);
		// System.out.println(n);
	}
}
