package es.curso.java.introduccion.funciones.ejercicios;

import java.util.Scanner;

public class VelocidadCoche {

	
	public static void main (String [] args){

		Scanner scan = new Scanner(System.in);
		double espacio = scan.nextDouble();
		int tiempo = scan.nextInt();
		calculoVelocidad(9.6 , 7);
	
			
	}
	
	public static void calculoVelocidad (double distancia, int tiempo) {
		System.out.println("Velocidad: "+distancia/tiempo);
		
	}
	

	
	
}
