package model;

public class Circulo {
	private double radio;

	public Circulo () {
		
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double calcularSuperficie () {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public String mostrarSuperficie () {
		return "La superficie del circulo es " + calcularSuperficie() + "cm^2";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

}
