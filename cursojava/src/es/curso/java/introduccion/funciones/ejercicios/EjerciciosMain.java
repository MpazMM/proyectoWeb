package es.curso.java.introduccion.funciones.ejercicios;

import java.util.Scanner;

public class EjerciciosMain {
	
public static void main (String [] args){

		//Calcular Edad
		System.out.println("Introduce tu año de nacimiento.");
		Scanner scan = new Scanner(System.in);
			String anio = scan.nextLine();
			int edad= CalcularEdad.calculoEdad(anio);
			System.out.println("Tu edad es " + edad);
			
			
		//Tabla Multiplicar	
			System.out.println("Indica la tabla de multiplicar");
			int numMultiplicar = scan.nextInt();
			TablaMultiplicar.pintaTablaMultiplicar(numMultiplicar);
			
	}

}
