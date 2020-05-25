package model;

public class Parrafo {
	private String parrafo;

	public Parrafo () {	
	}

	public int contarPalabras() {
		int contador = 1, pos;
		String cadena = parrafo.trim(); //eliminar los posibles espacios en blanco al principio y al final
		if (cadena.isEmpty()) { //si la cadena está vacía
			contador = 0;
		} else {
			pos = cadena.indexOf(" "); //se busca el primer espacio en blanco
			while (pos != -1) { //mientras que se encuentre un espacio en blanco
				contador++; //se cuenta una palabra
				pos = cadena.indexOf(" ", pos + 1); //se busca el siguiente espacio en blanco
			}                                               //a continuación del actual
		}
		return contador;
	}

	public int contarOraciones() {
		int contador = 0, pos;
		String cadena = parrafo.trim(); //eliminar los posibles espacios en blanco al principio y al final
		if (cadena.isEmpty()) { //si la cadena está vacía
			contador = 0;
		} else {
			pos = cadena.indexOf('.'); //se busca el primer espacio en blanco
			while (pos != -1) { //mientras que se encuentre un espacio en blanco
				contador++; //se cuenta una palabra
				pos = cadena.indexOf('.', pos + 1); //se busca el siguiente espacio en blanco
			}                                               //a continuación del actual
		}
		return contador;
	}

	public String ContarE () {
		int i=0, posI = i, posF, contE = 0, contE2=0; 
		String cadena = this.parrafo.trim(); 
		if (cadena.isEmpty()) { 
			return "Cadena Vacia";
		} else {
			while (i < cadena.length()) {
				String oraciones = new String();  
				if (cadena.charAt(i)=='.') {
					posF=i;

					for (int k = posI ; k <= posF; k++) {
						oraciones = oraciones + cadena.charAt(k);
					}

					oraciones = oraciones.trim();

					for (int j = 0 ; j < oraciones.length() ; j++) {
						if (oraciones.charAt(j)=='e')
							contE++;
					}

					System.out.println("La cantidad de letra e en | " + oraciones + "| es " + contE);
					contE2 = contE2 + contE;
					posI = posF+1;
					contE=0;
				}
				i++;
			}

		}
		return "La cantidad total de letras e es " + contE2;
	}

	/**
	 * @return the parrafo
	 */
	public String getParrafo() {
		return parrafo;
	}

	/**
	 * @param parrafo the parrafo to set
	 */
	public void setParrafo(String parrafo) {
		this.parrafo = parrafo;
	}
}
