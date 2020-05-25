package principal;

import java.util.Scanner;

import model.PalabraRepetida;

public class PrincipalPalabraRepetida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PalabraRepetida palabra = new PalabraRepetida();
		System.out.println("Ingrese una cadena");
		palabra.setCadena(sc.nextLine());
		System.out.println("Ingrese la cadena que desea buscar");
		palabra.setPalabra(sc.nextLine());
		System.out.println(palabra.mostrarCantidad());
		sc.close();
	}

}
