package principal;

import model.Contrase�a;

public class PrincipalContrase�a {

	public static void main(String[] args) {
		Contrase�a pass = new Contrase�a();
		pass.setContrase�a("aA1?a1Ap");
		System.out.println(pass.mostrarSiContrase�aEsCorrecta());
	}

}
