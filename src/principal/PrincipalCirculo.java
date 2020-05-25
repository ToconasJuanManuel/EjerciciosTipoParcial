package principal;

import java.util.Scanner;

import model.Circulo;

public class PrincipalCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese radio");
		Circulo circulo = new Circulo();
		circulo.setRadio(sc.nextDouble());
		System.out.println(circulo.mostrarSuperficie());
		System.out.println("FIN");
		sc.close();
	}

}
