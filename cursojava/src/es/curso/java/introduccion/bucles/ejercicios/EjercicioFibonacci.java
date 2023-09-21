package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioFibonacci {
	public static void main(String[] args) {
		
		System.out.println("Introduce la posición.");
		Scanner scan = new Scanner(System.in);
		
				int posicion = scan.nextInt();
		
		int pos1 = 1;
		int pos2 = 1;
		int pos3;
				if (posicion>=1) {
					System.out.println(pos1);
				}
				if (posicion>=2) {
					System.out.println(pos2);
				}
		for (int i = 3 ; i <= posicion ; i++ ) {
			pos3 = pos1 + pos2;
			System.out.println(pos3);
			pos1 = pos2;
			pos2 = pos3;
		}
				
	}
}
