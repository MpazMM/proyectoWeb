package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main(String[] args) {
		
//Variables
		int tamanio = 0;
		
		System.out.println("Indica el tamaño del cuadrado");
		Scanner scan = new Scanner(System.in);
		tamanio = scan.nextInt();
				
		for(int i = 0; i < tamanio; i++) {
            System.out.print("*");
        }
        System.out.println();
       

        for(int i = 0; i < tamanio-2; i++) {
            System.out.print("*");
            for(int j = 0; j < tamanio-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
       
        
        for(int i = 0; i < tamanio; i++) {
            System.out.print("*");
        }
	}
}
