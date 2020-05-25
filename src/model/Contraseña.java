package model;

public class Contrase�a {
	private String contrase�a;

	public Contrase�a () {
	}

	public boolean verificarContrase�a() {
		String cad = this.contrase�a;
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
	
	public String mostrarSiContrase�aEsCorrecta() {
		if(verificarContrase�a() == true)
			return "Contrase�a segura";
		else
			return "contrase�a INsegura";
	}

	/**
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a the contrase�a to set
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}
