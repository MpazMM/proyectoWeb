package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioEdades {
	public static void main(String[] args) {
	
		System.out.println("Introduce tu nombre.");
		Scanner scan = new Scanner(System.in);
		
				String nombre = scan.nextLine();
				
		System.out.println("Introduce tu edad.");
				
				int edad = scan.nextInt();
				String etapa = "";
				
				
				if(edad<=5) {		
					etapa = "bebé";
				}else if (edad<=15) {
					etapa = "niño";
				}else if (edad<=20) {
					etapa = "adolescente";
				}else if (edad<=40) {
					etapa = "viejoven";
				}else if (edad<=60) {
					etapa = "adulto";
				}else if (edad<=100) {
					etapa = "anciano";
				}else {
					etapa = "¿Estás vivo?";
				}
				System.out.println("Te llamas " + nombre + " y eres " + etapa);

		}
}
