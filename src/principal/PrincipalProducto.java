package principal;

import model.Id;

//--------------------CONSULTA -> ¿Es correcto el uso de la clase ID tal como esta implementado y lo que solicita la consigna 2 pdf tipoParcial2?
import model.Producto;

public class PrincipalProducto {

	public static void main(String[] args) {
		Id id = new Id();
		Producto prod = new Producto ();
		prod.setId(id.generarId());
		prod.setDescripcion("arroz");
		prod.setPrecio(15.5);
		prod.setFormaPago("contado");
		System.out.println(prod.mostrarDatos());
		
		Producto prod2 = new Producto ();
		prod2.setId(id.generarId());
		prod2.setDescripcion("arroz");
		prod2.setPrecio(15.5);
		prod2.setFormaPago("financiado");
		System.out.println(prod2.mostrarDatos());
		
		Producto prod3 = new Producto ();
		prod3.setId(id.generarId());
		prod3.setDescripcion("arroz");
		prod3.setPrecio(15.5);
		prod3.setFormaPago("contado");
		System.out.println(prod3.mostrarDatos());
	}

}
