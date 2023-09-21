package es.curso.java.introduccion.arrays;

public class EjemplosArrays {

	public static void main(String[] args) {
		
		
		
	//	String nombre = "Raúl"; 
		
		//Siempre que tengamos los dos corchetes es un arrays
		// También se puede poner así String [] nombres =
		String nombres [] = {"n1","n2","n3","n4"};
		System.out.println(nombres.length);
		
		//Para saber el valor de la posición
		System.out.println(nombres[1]);
		System.out.println(nombres[3]);
		
		nombres[2]="n10";
		
		for ( int i=0 ; i<nombres.length ; i++ ) {
		//	System.out.println(i);
			System.out.println(nombres[i]);
		}
		
		//Si no conocemos los valores
		int [] numeros = new int[3];
		numeros[1]=9;
		for ( int i=0 ; i<numeros.length ; i++ ) {
				System.out.println(numeros[i]);
		}
	}
	
}
