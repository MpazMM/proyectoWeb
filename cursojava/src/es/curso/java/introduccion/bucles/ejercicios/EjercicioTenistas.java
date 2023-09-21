package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioTenistas {
	public static void main(String[] args) {

		
		int tenistas = 0;
		int posicion = 0;
		int resultado = 0;
		
		System.out.println("Indica cuántos tenistas participan");
			Scanner scan = new Scanner(System.in);
	     	tenistas = scan.nextInt();
	     	
		for( int num=1 ; num<=tenistas ; num++ ) {		
			System.out.println("Tenista "+ num +" ¿En qué posición se encuentra?");
			scan = new Scanner(System.in);
			posicion = scan.nextInt();
			
			if (posicion<=10) {
				resultado++;
			}
		}
		System.out.println("Hay " + resultado + " tenistas que están en el top 10");	
	}
}
