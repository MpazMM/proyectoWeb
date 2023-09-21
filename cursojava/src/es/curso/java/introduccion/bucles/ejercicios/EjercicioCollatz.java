package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCollatz {
	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.println("Indica un número");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		for ( ; num!=1 ; ) {	
		if (num%2 == 0) {
			System.out.println (num = num/2);
		}else {
			System.out.println (num = (num*3)+1);
			}
		}
	}
}
