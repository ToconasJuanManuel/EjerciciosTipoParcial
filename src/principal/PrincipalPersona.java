package principal;

import java.util.Scanner;

import model.Persona;

public class PrincipalPersona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese sus datos");
		System.out.println("nombre");
		String nombre = sc.next();
		System.out.println("edad");
		int edad = sc.nextInt();
		System.out.println("dni");
		long dni = sc.nextLong();
		System.out.println("sexo");
		char sexo = sc.next().charAt(0);
		System.out.println("peso en Kg");
		double peso = sc.nextDouble();
		System.out.println("altura ");
		double altura = sc.nextDouble();
		Persona p1 = new Persona(nombre, edad, dni,sexo,peso,altura);
		System.out.println(p1.MostrarDatos());
		System.out.println(p1.mostrarImc());

		System.out.println("Ingrese sus datos");
		System.out.println("nombre");
		nombre = sc.next();
		System.out.println("edad");
		edad = sc.nextInt();
		System.out.println("dni");
		dni = sc.nextLong();
		System.out.println("sexo");
		sexo = sc.next().charAt(0);
		System.out.println("peso");
		peso = sc.nextDouble();
		System.out.println("altura");
		altura = sc.nextDouble();
		Persona p2 = new Persona(nombre, edad, dni,sexo,peso,altura);
		System.out.println(p2.MostrarDatos());
		System.out.println(p2.mostrarImc());

		System.out.println("Ingrese sus datos");
		System.out.println("nombre");
		nombre = sc.next();
		System.out.println("edad");
		edad = sc.nextInt();
		System.out.println("dni");
		dni = sc.nextLong();
		System.out.println("sexo");
		sexo = sc.next().charAt(0);
		System.out.println("peso");
		peso = sc.nextDouble();
		System.out.println("altura");
		altura = sc.nextDouble();
		Persona p3 = new Persona(nombre, edad, dni,sexo,peso,altura);
		System.out.println(p3.MostrarDatos());
		System.out.println(p3.mostrarImc());
	sc.close();
	}
	
}
