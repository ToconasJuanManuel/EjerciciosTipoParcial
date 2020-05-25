package model;

//-----------------------CONSULTA -> ¿El metodo toString se refiere a un metodo que muestre datos o uno que utilice necesariamente el metodo toString del objeto String?

public class Persona {
	private String nombre ;
	private int edad  ;
	private long dni ;
	private char sexo ; 
	private double peso; 
	private double altura;

	public Persona() {
		
	}
	public Persona(String nombre, int edad, long dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public int calcularImc () {
		double resultadoFormula = this.peso / Math.pow((double) this.altura, 2);
		System.out.println(resultadoFormula);
		int imc = 99;
		if (resultadoFormula < 20)
			imc = -1;
		else
			if (resultadoFormula <= 25)
				imc = 0;
			else
				if (resultadoFormula > 25)
					imc = 1;
		return imc;
	}

	public String mostrarImc() {
		int imc = calcularImc();
		if (imc ==0)
			return "Su imc dio 0, esta debajo se su peso ideal";
		else
			if (imc == 1)
				return "Su imc dio 1, esta por encima de su peso ideal";
			else
				return "Esta en su peso ideal";
	}

	public boolean verificarMayorDeEdad () {
		if (this.edad > 18)
			return true;
		else
			return false;
	}

	public String MostrarDatos () {
		String verEdad;
		if (verificarMayorDeEdad() == true)
			verEdad = " es adulto/a ";
		else
			verEdad = " no es un adulto/a ";
		return "Usuario : " + this.nombre + " | dni :" + this.dni + "| edad :" + this.edad + " que " + verEdad  +"| sexo :" + this.sexo + "| peso :" + this.peso + "Kg| altura :" + this.altura ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
}
