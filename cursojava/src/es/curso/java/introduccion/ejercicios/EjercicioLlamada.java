package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioLlamada {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
				
		System.out.println("Introduce los minutos de tu llamada");
				
				int tiempo = scan.nextInt();
				
		System.out.println("¿Qué día realizaste la llamada?");	
		scan = new Scanner(System.in);
				String diaSemana = scan.nextLine();
				
		System.out.println("Por la mañana o por la tarde");
		scan = new Scanner(System.in);
				String jornadaDia = scan.nextLine();
		
				double precio = 0;
				double porcentajeDomingo = 0.03;
				double porcentajeManiana = 0.15;
				double porcentajeTarde = 0.1;
				
				//Cálculo coste llamada
				if (tiempo <= 5) {
					precio = 1;
				}else if (tiempo <= 8) {
					precio = 1 + 0.80;
				}else if (tiempo <= 10) {
					precio = 1 + 0.80 + 0.70;
				}else {
					precio = 1 + 0.80 + 0.70 + ((tiempo-10)*0.5);
				}	
				
				//Aplicamos impuestos
				if (diaSemana.equalsIgnoreCase("domingo")) {
					precio += (precio*porcentajeDomingo);
				} else {
					if (jornadaDia.equalsIgnoreCase("mañana")) {
						precio += (precio*porcentajeManiana);
					} else if (jornadaDia.equalsIgnoreCase("tarde")) {
						precio += (precio*porcentajeTarde);
					}		
				}
				System.out.println(precio);	
		}
}
