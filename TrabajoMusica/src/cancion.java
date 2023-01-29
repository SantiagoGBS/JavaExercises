

public class cancion {
	protected int codigogrupo;
	protected String disco;
	protected String cancion;
	protected int duracion;

	public cancion(int codigogrupo, String disco, String cancion, int duracion) {
		super();
		this.codigogrupo = codigogrupo;
		this.disco = disco;
		this.cancion = cancion;
		this.duracion = duracion;
	}

	public cancion() {

		this.codigogrupo = 0;
		this.disco = "";
		this.cancion = "";
		this.duracion = 0;
	}

	public int getCodigogrupo() {
		return codigogrupo;
	}

	public void setCodigogrupo(int codigogrupo) {
		this.codigogrupo = codigogrupo;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "cancion [codigogrupo=" + codigogrupo + ", disco=" + disco + ", cancion=" + cancion + ", duracion="
				+ duracion + "]";
	}

}
