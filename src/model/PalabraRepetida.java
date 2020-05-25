package model;

public class PalabraRepetida {
	private String cadena;
	private String palabra;

	public PalabraRepetida () {

	}

	public int calcularPalabraRepetida () {
		int contador = 0;
		String busqueda = this.palabra;
		int posicion = this.cadena.indexOf(busqueda);
		if (posicion == -1)
			return 0;
		else {
			while (posicion > -1) {
				contador++;
				posicion = this.cadena.indexOf(busqueda, posicion+1);
			}
			return contador;
		}
			
	}
	
	public String mostrarCantidad () {
		return "La cantidad de veces que aparece su palabra en la cadena es " + calcularPalabraRepetida();
	}

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * @param palabra the palabra to set
	 */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * @return the cadena
	 */
	public String getCadena() {
		return cadena;
	}

	/**
	 * @param cadena the cadena to set
	 */
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}



}
