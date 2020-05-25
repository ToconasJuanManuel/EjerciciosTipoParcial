package principal;

import java.util.Scanner;

import model.InversionCadena;

public class PrincipalInversionCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InversionCadena inv = new InversionCadena();
		inv.setPalabra("HoLA");
		System.out.println(inv.mostrar());

	}

}
