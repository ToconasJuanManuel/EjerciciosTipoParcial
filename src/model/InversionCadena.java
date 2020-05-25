package model;

public class InversionCadena {
	private String palabra;

	public  InversionCadena () {

	}

	public String invertirCadena() {
		String nuevaCad = new String();
		for(int i=0; i < this.palabra.length() ; i++) {
			String comp = String.valueOf(this.palabra.charAt(i));
			String may= comp.toLowerCase();
			String min= comp.toUpperCase();
			if (comp.equals(may))
				nuevaCad = nuevaCad+min.charAt(0);
			else
				nuevaCad = nuevaCad+may.charAt(0);
		}
		return nuevaCad;
	}

	public int contarVocales () {
		int cont = 0;
		String minus = this.palabra.toLowerCase();
		for (int i = 0; i <  minus.length() ; i++) {
			if (minus.charAt(i)=='a' || minus.charAt(i)=='e' || minus.charAt(i)=='i' || minus.charAt(i)=='o' || minus.charAt(i)=='u')
				cont ++;
		}
		return cont;
	}

	public String mostrar() {
		return "La cadena invertida es " + invertirCadena() + " y la cantidad de vocales usadas es " + contarVocales() ;
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




}
