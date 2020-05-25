package model;

public class Productoria {
	private double numero;
	
	public double calcularFactorial (double limite) {
		double acumulador=1;
		for (int i=1; i<=limite;i++)
			acumulador = acumulador * i;
		return acumulador;
	}
	
	public double calcularProductoria () {
		double acumulador=1;
		for(double i = this.numero ; i <=3 ; i++) {
			acumulador = acumulador * ( Math.pow(2, 2 * i -1) * 3 * Math.pow(5, i *calcularFactorial(i)));
		}
		return acumulador;
	}
	public Productoria () {	
	}

	/**
	 * @return the numero
	 */
	public double getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	
}
