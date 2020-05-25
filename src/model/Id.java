package model;

/**
 * Clase creada para el uso de producto de forma que su ID aumente su valor automaticamente
 */

public class Id {
	private long contador = 0;
	
	public Id () {
		
	}
	
	public Id(long contador) {
		this.contador = contador;
	}
	
	public long generarId () {
		return contador++;
	}
	

	/**
	 * @return the contador
	 */
	public long getContador() {
		return contador;
	}

	/**
	 * @param contador the contador to set
	 */
	public void setContador(long contador) {
		this.contador = contador;
	}
	
	
}

