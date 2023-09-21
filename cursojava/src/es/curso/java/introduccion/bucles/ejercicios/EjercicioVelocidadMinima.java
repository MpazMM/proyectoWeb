package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioVelocidadMinima {
	public static void main(String[] args) {
		
		
//Variables
		int numcoche = 0;
		int velocidadMinima = 400;
		
		System.out.println("Indica el número de coches");
		Scanner scan = new Scanner(System.in);
		numcoche = scan.nextInt();
				
		for( int i=1 ; i<=numcoche ; i++) {
				System.out.println("Indica la velocidad máxima " +i);
				scan = new Scanner(System.in);
				int velocidadCoche = scan.nextInt();
				
				if (velocidadCoche<velocidadMinima) {
					velocidadMinima = velocidadCoche;
				}
			}
		
		System.out.println("La velocidad mínima es " + velocidadMinima);
		
		}
}
