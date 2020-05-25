package principal;

import model.Parrafo;

public class PrincipalParrafo {

	public static void main(String[] args) {
		Parrafo p = new Parrafo();
		p.setParrafo("   Hola como estas?. La vida es buena. Chau.");
		System.out.println(p.contarPalabras());
		System.out.println(p.contarOraciones());
		System.out.println(p.ContarE());
	}

}
