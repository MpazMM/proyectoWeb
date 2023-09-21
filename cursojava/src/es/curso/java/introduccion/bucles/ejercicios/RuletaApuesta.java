package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class RuletaApuesta {

	public static void main(String[] args) {
		double importe = 1000;
		String respuesta = "";
		String menu = "";
		String color = "";
		String parImpar = "";
		String ResultadoParImpar = "";
		String ResultadoColor = "";
		String colorApostado = "";
		int opcion;
		int numeroApostado;
		double importeApostado;
		double numeroAleatorio;
		int decena = 0;
		
		do {			
			menu = ("1. Apostar por un número (0-36)\n2. Apostar por docenas (0-12/13-24/25-36)\n3. Apostar por par/impar\n4. Apostar por verde/rojo/negro\n5. Dejar de jugar");
			System.out.println(menu);
			System.out.println("Selecciona una opción");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
		
			
//APUESTAS NÚMEROS			
				if(opcion == 1) {		
					System.out.println("¿Por qué numero quieres apostar?");
					numeroApostado = scan.nextInt();
					System.out.println("Cuanto quieres apostar de los " +importe+ " €");
					importeApostado = scan.nextDouble();
					Random rand = new Random();
					numeroAleatorio = rand.nextInt(37);
					System.out.println("La ruleta ha sacado un "+numeroAleatorio);
					importe-=importeApostado;
					if(numeroApostado==numeroAleatorio) {
						System.out.println("Enhorabuena has acertado!!!");
						importe+=importeApostado*36;
					}
					
					if (importe>0) {
						System.out.println("Te quedan "+ importe + " euros");
						System.out.println("Quieres seguir jugando??");
						scan = new Scanner(System.in); 
						respuesta = scan.nextLine();
					}
				}
	
//APUESTAS DECENAS
				if (opcion == 2) {
					System.out.println("¿Por qué decena quieres apostar?\n1. 0-12\n2. 13-24\n3. 25-36");
					numeroApostado = scan.nextInt();
					System.out.println("Cuanto quieres apostar de los " +importe+ " €");
					importeApostado = scan.nextDouble();
					Random rand = new Random();
					numeroAleatorio = rand.nextInt(37);
					System.out.println("La ruleta ha sacado un "+numeroAleatorio);
						if (numeroAleatorio <= 12) {
							decena = 1;
						}else if (numeroAleatorio <= 24){
							decena = 2;
						}else if (numeroAleatorio <= 36){
							decena = 3;
						}
					importe-=importeApostado;
					if(numeroApostado == decena) {
						System.out.println("Enhorabuena has acertado!!!");
						importe+=importeApostado*3;
					}
					
					if (importe>0) {
						System.out.println("Te quedan "+ importe + " euros");
						System.out.println("Quieres seguir jugando??");
						scan = new Scanner(System.in); 
						respuesta = scan.nextLine();
						}
					}
//APUESTAS PAR O IMPAR	
//				
//				if (opcion == 3) {
//					System.out.println("Apuestas por par o impar?");
//					numeroApostado = scan.nextInt();
//					if (numeroApostado%2==0) {
//						parImpar.equalsIgnoreCase ("Par");
//					}else {
//						parImpar.equalsIgnoreCase ("Impar");
//					}
//				System.out.println("Cuanto quieres apostar de los " +importe+ " €");
//				importeApostado = scan.nextDouble();
//				Random rand = new Random();
//				numeroAleatorio = rand.nextInt(37);
//				System.out.println("La ruleta ha sacado un "+numeroAleatorio);
//					if (numeroAleatorio%2==0) {
//						ResultadoParImpar = "Par";
//					}else {
//						ResultadoParImpar = "Impar";
//					}
//				importe-=importeApostado;
//				if(ResultadoParImpar == parImpar) {
//					System.out.println("Enhorabuena has acertado!!!");
//					importe+=importeApostado*2;
//				}
//				
//				if (importe>0) {
//					System.out.println("Te quedan "+ importe + " euros");
//					System.out.println("Quieres seguir jugando??");
//					scan = new Scanner(System.in); 
//					respuesta = scan.nextLine();
//					}
//				}
				
//APUESTAS COLOR				
				if (opcion == 4) {
					System.out.println("Apuestas por verde, rojo o negro?");
					colorApostado = scan.nextLine();
//					System.out.println("Cuanto quieres apostar de los " +importe+ " €");
//					importeApostado = scan.nextDouble();
					Random rand = new Random();
					numeroAleatorio = rand.nextInt(37);
					System.out.println("La ruleta ha sacado un "+numeroAleatorio);
						if (numeroAleatorio==0) {
							ResultadoColor = "verde";
						}else if (numeroAleatorio<=18) { 
							ResultadoColor = "negro";
						}else {
							ResultadoColor = "rojo";
						}
					importe-=importeApostado;
						if(ResultadoColor == colorApostado) {
							System.out.println("Enhorabuena has acertado!!!");
							importe+=importeApostado*2;
						}
						
					if (importe>0) {
						System.out.println("Te quedan "+ importe + " euros");
						System.out.println("Quieres seguir jugando??");
						scan = new Scanner(System.in); 
						respuesta = scan.nextLine();
					}
				}
				
	
		}while(importe>0 && !respuesta.equalsIgnoreCase("no"));
		
		System.out.println("Te has quedado con "+ importe);
	}

}
