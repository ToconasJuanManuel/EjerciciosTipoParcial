package principal;

import java.util.Scanner;

import model.Triangulo;

public class PrincipalTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		System.out.println("Ingrese los lados del triangulo");
		triangulo.setLadoA(sc.nextDouble());
		triangulo.setLadoB(sc.nextDouble());
		triangulo.setLadoC(sc.nextDouble());
		System.out.println(triangulo.mostrarTriangulo());
		sc.close();
	}

}
