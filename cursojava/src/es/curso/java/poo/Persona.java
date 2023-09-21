package es.curso.java.poo;


//POJO - Clase que sólo definimos atributos y métodos
public class Persona {
	
	//Variables de instancia
	String nombre;
	String apellidos;
	String dni;
	int edad;

	//Métodos. Los que están en la clase padre no suelen
	//ser estáticos
	public void correr () {
		System.out.println("La persona con nombre " + nombre + "y edad " + edad + " está corriendo");
		
	}
	
	
}
