package es.curso.java.introduccion.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioNotasAlumnos {

	public static void main(String[] args) {
		
		double sumaNotas = 0;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Indica número de notas a almacenar");
		int numNotas = scan.nextInt();
		
		double [] notas = new double [numNotas];
			
		for( int i=0 ; i < numNotas ; i++ ) {
			System.out.println("Indica las notas del alumno " + (i+1));
			scan = new Scanner(System.in);
			notas[i] = scan.nextDouble();
		}
		
		for (int i = 0 ; i < numNotas ; i++) {
			sumaNotas += notas[i];
		}
		
		System.out.println("La media de las notas es " + sumaNotas/numNotas);
		
		double notaMayor = notas[0];
		double notaMenor = notas[0];
		
		for (int i = 1 ; i < numNotas ; i++) {
			sumaNotas += notas[i];
			if (notas[i]>notaMayor) {
				notaMayor = notas[i];
				}
			if (notas[i]<notaMenor) {
				notaMenor = notas[i];
				}
			}
		
		System.out.println("La nota máxima es " + notaMayor);
		System.out.println("La nota mínima es " + notaMenor);

		
	}
}
