package es.curso.java.introduccion.funciones.ejercicios;

import java.util.Scanner;

public class CalcularEdad {

	public static void main (String [] args){

		
		System.out.println("Introduce tu año de nacimiento.");
		Scanner scan = new Scanner(System.in);
			String anio = scan.nextLine();
			int edad= calculoEdad(anio);
			System.out.println("Tu edad es " + edad);
			
			
	}
	
	static int calculoEdad (String anioNacimiento) {
		final int anioActual = 2023;
		int anioNacimientoInt = Integer.parseInt(anioNacimiento);
		int resultado = anioActual - anioNacimientoInt;
		return resultado;
		
	}
	

	
}
