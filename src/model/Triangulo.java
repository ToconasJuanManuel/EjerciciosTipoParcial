package model;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public boolean coconerSiEsTriangulo () {
		boolean opcA = false;
		boolean opcB = false;
		boolean opcC = false;

		if(ladoA+ladoB > ladoC)
			opcA = true;

		if(ladoB+ladoC > ladoA)
			opcB = true;

		if(ladoC+ladoA > ladoB)
			opcC = true;

		if (opcA == true && opcB ==true && opcC ==true)
			return true;
		else
			return false;
	}
	
	public String mostrarTriangulo () {
		String confirmacion;
		if (coconerSiEsTriangulo() == true)
			confirmacion = "es un triangulo";
		else
			confirmacion = "no es un triangulo";
		return confirmacion;
	}



	public Triangulo () {

	}

	/**
	 * @return the ladoA
	 */
	public double getLadoA() {
		return ladoA;
	}

	/**
	 * @param ladoA the ladoA to set
	 */
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	/**
	 * @return the ladoB
	 */
	public double getLadoB() {
		return ladoB;
	}

	/**
	 * @param ladoB the ladoB to set
	 */
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	/**
	 * @return the ladoC
	 */
	public double getLadoC() {
		return ladoC;
	}

	/**
	 * @param ladoC the ladoC to set
	 */
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}


}
