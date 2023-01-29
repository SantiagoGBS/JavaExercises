package zzzExamen2;

public class ProductoPedido {
	public int codigoPedido;
	public int codigoProducto;
	public String nombreProducto;
	public String descripción;
	public String temporada;
	public double precioKg;
	public double kg;

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getPrecioKg() {
		return precioKg;
	}

	public void setPrecioKg(double precioKg) {
		this.precioKg = precioKg;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public ProductoPedido(int codigoPedido, int codigoProducto, String nombreProducto, String descripción,
			String temporada, double precioKg, double kg) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.descripción = descripción;
		this.temporada = temporada;
		this.precioKg = precioKg;
		this.kg = kg;
	}

	public ProductoPedido() {
		super();
		this.codigoPedido = 0;
		this.codigoProducto = 0;
		this.nombreProducto = "";
		this.descripción = "";
		this.temporada = "";
		this.precioKg = 0.0;
		this.kg = 0.0;
	}

	@Override
	public String toString() {
		return ("\t" + this.nombreProducto + "\t" + this.precioKg + "€/kg\t" + this.kg + "kg");
	}

}
