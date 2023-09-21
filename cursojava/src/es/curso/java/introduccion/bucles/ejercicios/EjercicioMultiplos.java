package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioMultiplos {
	public static void main(String[] args) {

		
		System.out.println("Indica 10 números");
		
		int mult3 = 0;
		int mult5 = 0;
		int numero = 0;
	
		for( int num=1 ; num<=10 ; num++ ) {		
			Scanner scan = new Scanner(System.in);
			numero = scan.nextInt();
			
			if (numero%3 == 0) {
				mult3++;
			}
			
			if (numero%5 == 0) {
				mult5++;
			}
		}
		System.out.println("Hay " + mult3 + " que son múltiplos de 3");
		System.out.println("Hay " + mult5 + " que son múltiplos de 5");		
	}
}
