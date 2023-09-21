package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioTablasMultiplicar {
	public static void main(String[] args) {
		
	
		
		System.out.println("Tablas de multiplicar");
				
		
		for (int i = 1 ; i <= 10 ; i++ ) {
			for (int j = 1 ; j <= 10 ; j++ ) {
				System.out.println(i+" * " + j + " = " + (i*j));
			}
		System.out.println("============================");
		}
	}
}
