package principal;

import model.Contraseña;

public class PrincipalContraseña {

	public static void main(String[] args) {
		Contraseña pass = new Contraseña();
		pass.setContraseña("aA1?a1Ap");
		System.out.println(pass.mostrarSiContraseñaEsCorrecta());
	}

}
