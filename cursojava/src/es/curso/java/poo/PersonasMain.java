package es.curso.java.poo;

public class PersonasMain {

	public static void main (String[] args) {
		
		//Izquierda es variable, derecha se está creando el objeto
		Persona p1 = new Persona();
		//Si intento pintar un objeto JAVA no sabe pintar la información, 
		//pinta la posición de memoria
		//System.out.println(p1);
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		p1.nombre = "Eva";
		System.out.println(p1.nombre);
		
		Persona p2 = new Persona();
		//Para no perder la información del objeto Persona1
		//Metemos la información en la variable p3
		Persona p3 = p1;
		p1 = p2;
		p2.nombre = "María";
		
		System.out.println(p3.nombre);
		
		p1.correr();
		
		
		
	}
	
}
