package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioAlumnos {
	public static void main(String[] args) {
		
		
//Variables
		int alumnos = 0;
		double notas = 0;
		
		System.out.println("Indica el número de alumnos");
		Scanner scan = new Scanner(System.in);
		alumnos = scan.nextInt();
				
		for( int num=1 ; num<=alumnos ; num++ ) {
				System.out.println("Indica la nota del alumno");
				notas += scan.nextInt();
				}
		System.out.println("La nota media de la clase es " + (notas/alumnos));
		
		}
}
