package model;

public class Contraseña {
	private String contraseña;

	public Contraseña () {
	}

	public boolean verificarContraseña() {
		String cad = this.contraseña;
		int longitud = cad.length();
		int num=0,simb=0,may=0,min=0, blancos=0;		
		if(longitud < 8)
			return false;
		else {
			for(int i=0; i < longitud ; i++) {
				if (cad.charAt(i) >= 49 && cad.charAt(i) <=57) 
					num++;

				if (cad.charAt(i) == '-' || cad.charAt(i) == '*'|| cad.charAt(i) == '?' || cad.charAt(i) == '!' || cad.charAt(i) == '@' || cad.charAt(i) == '#' || cad.charAt(i) == '$' || cad.charAt(i) == '/' || cad.charAt(i) == '(' || cad.charAt(i) == ')' || cad.charAt(i) == '{' || cad.charAt(i) == '}' || cad.charAt(i) == '='|| cad.charAt(i) == '.'|| cad.charAt(i) == ','|| cad.charAt(i) == ';') 
					simb++;

				if (cad.charAt(i)==' ')
					blancos++;

				if(cad.charAt(i)>=65 && cad.charAt(i)<=90)
					may++;

				if(cad.charAt(i)>=97 && cad.charAt(i)<=122)
					min++;
			}

			if(num>0 && simb > 0 && blancos == 0 && may > 0 && min >0)
				return true;
			else 
				return false;
		}
	}
	
	public String mostrarSiContraseñaEsCorrecta() {
		if(verificarContraseña() == true)
			return "Contraseña segura";
		else
			return "contraseña INsegura";
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
