package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCuadrado {
	public static void main(String[] args) {
		
		
		System.out.println("Indica el tamaño del cuadrado");
		Scanner scan = new Scanner(System.in);
		int numLados = scan.nextInt();
				
		for(int i = 1; i <= numLados; i++) {
            for(int j = 1; j <= numLados; j++) {
                if (i == 1 || i == numLados) {
                	System.out.println(" * ");
                }else {
                	if(j == 1 || j == numLados) {
                		System.out.println(" * "); 
            		}else {
            			System.out.println("   ");
            		}
                }
            }
            System.out.println();    	
            
       }

	}
}
