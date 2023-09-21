package es.curso.java.introduccion.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioColores {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica el número de colores que quieres guardar");
		int numColores = scan.nextInt();
		
		String [] colores = new String [numColores];
			
		for( int i=0 ; i < colores.length ; i++ ) {
			System.out.println("Indica el color" + (i+1));
			scan = new Scanner(System.in);
			colores[i] = scan.nextLine().trim();
		}
		
//		for( int i=0 ; i < colores.length ; i++ ) {
//			System.out.println(colores[i]);
//		}
		
		//Bucle for-each. Sintaxis 2 partes: derecha el elemento que queremos recorrer 
		//y a la izquierda hay qur definir las variables (elementos) que extraigan
		for (String color : colores) {
			if(color.contains("o") && color.toLowerCase().charAt(0)=='a') {
			//if(color.contains("o") && color.toLowerCase().startsWith(0)=='a') {
				System.out.println(color);
			}
	
		}
	}	
}
