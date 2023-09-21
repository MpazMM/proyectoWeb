package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioApuestas {
	public static void main(String[] args) {

		int dinero = 1000;
		int dado = (int)(Math.random()*6)+1;
		int apuesta;
		int numApuesta;
		int resultado;
		String respuesta = "";
		
		
		for (int i = 0 ; dinero>0 ; i++) {
			do {
				System.out.println("¿Cuánto quieres apostar?");
				Scanner scan = new Scanner(System.in);
				apuesta = scan.nextInt();
				
					if (apuesta > 1000) {
						System.out.println("Importe insuficiente");
					}else {
						System.out.println("¿Número a apostar?");
						numApuesta = scan.nextInt();
						System.out.println("El dado tiene como resultado " + dado);
						if (dado == numApuesta) {
							resultado = apuesta*3 + 1000;
							System.out.println("¡Has ganado! Ahora dispones de " + resultado);
						}else {
							System.out.println("¡Has perdido!");
						}
					}
				System.out.println("¿Deseas seguir jugando?");
//				Scanner scan = new Scanner(System.in);
				respuesta = scan.nextLine();
			}while (!respuesta.equalsIgnoreCase("Si"));
				
			}
			
			
		}
}
