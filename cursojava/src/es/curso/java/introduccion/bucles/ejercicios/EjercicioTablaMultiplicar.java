package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioTablaMultiplicar {
	public static void main(String[] args) {
		
	
		int resultado = 0;
		int tabla = 0;
		
		System.out.println("Indica qué tabla de multiplicar necesitas");
		Scanner scan = new Scanner(System.in);
		tabla = scan.nextInt();
				
		for (int num = 1 ; num < 11 ; num++ ) {
				resultado = num * tabla;
				System.out.println(num+" * " + tabla + " = " + resultado);
			}
		}

}
