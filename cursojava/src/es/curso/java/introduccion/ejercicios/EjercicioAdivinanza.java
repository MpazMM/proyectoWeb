package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioAdivinanza {
	public static void main(String[] args) {
		//Poner una adivinanza para que el usuario incluya su respuesta en la consola y ponga su respuesta para si es correcto o incorrecto.
		System.out.println("Oro parece, plata no es...");
		Scanner scan = new Scanner(System.in);
		
				String respuesta = scan.nextLine();
			
				if(respuesta.equalsIgnoreCase("Plátano")) {		
					System.out.println("¡Enhorabuena! Respuesta correcta.");
				}else {
					System.out.println("Lo siento, la respuesta no es correcta.");
				}
		}
}
