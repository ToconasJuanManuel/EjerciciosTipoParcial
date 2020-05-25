package model;

//--------------------CONSULTA -> ¿Es correcto el uso de la clase ID tal como esta implementado y lo que solicita la consigna 2 pdf tipoParcial2?


public class Producto {
	private long id;
	private String descripcion;
	private double precio;
	private String FormaPago;

	public Producto() {
	}



	public Producto(long id, String descripcion, double precio, String formaPago) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		FormaPago = formaPago;
	}



	public double calcularPrecioLista () {
		double lista = precio + (precio * 0.21);
		return lista;
	}

	public double calcularContado () {
		double contado = calcularPrecioLista() - calcularPrecioLista() * 0.1;
		return contado;
	}

	public double calcularFinanciado () {
		double financiado = calcularPrecioLista() + calcularPrecioLista() * 0.1;
		return financiado;
	}

	public String mostrarDatos() {
		String pagado = new String();
		if (this.FormaPago.equalsIgnoreCase("contado"))
			pagado = " el precio pagado fue $" + calcularContado();
		else
			if (this.FormaPago.equalsIgnoreCase("financiado"))
				pagado = " el precio pagado fue $" + calcularFinanciado();
		return "El producto "+ id + ":" + descripcion + " con precio sin IVA $" + precio + " tiene un precio de lista de : $" + calcularPrecioLista() + " dada su forma de pago " + FormaPago + pagado;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the formaPago
	 */
	public String getFormaPago() {
		return FormaPago;
	}

	/**
	 * @param formaPago the formaPago to set
	 */
	public void setFormaPago(String formaPago) {
		FormaPago = formaPago;
	}
}
