package principal;

import model.Productoria;

public class PrincipalProductoria {

	public static void main(String[] args) {
		Productoria productoria = new Productoria();
		productoria.setNumero(3);
		System.out.println("El valor de la productoria es " +productoria.calcularProductoria());
		System.out.println("FIN");

	}

}
