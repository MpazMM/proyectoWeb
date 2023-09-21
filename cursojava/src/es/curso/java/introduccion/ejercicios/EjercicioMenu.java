package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

//1. Mostrar meses estacion --> Preguntar por la estación, los meses de esa estacion
//2. Opcion2
//3. Opcion3
//4. Opcion4
//5. Salir
//
//Selecciona una opcion

public class EjercicioMenu {
	public static void main(String[] args) {

		String menu = ("1. Mostrar meses estación\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir");
		
		System.out.println(menu);
		System.out.println("Selecciona una opción");
		
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		opcion = scan.nextInt();
		
		if(opcion == 1) {		
			System.out.println("Indica nombre de la estación");
			scan = new Scanner(System.in);
			String estacion = scan.nextLine();
				if(estacion.equalsIgnoreCase("Invierno")) {
					System.out.println("Enero, Febrero y Marzo"); 
				}else if (estacion.equalsIgnoreCase("Primavera")) {
					System.out.println("Abril, Mayo y Junio");
				}else if (estacion.equalsIgnoreCase("Verano")) {
					System.out.println("Julio, Agosto y Septiembre");
				}else if (estacion.equalsIgnoreCase("Otoño")) {
					System.out.println("Octubre, Noviembre y Diciembre");
				}else {
					System.out.println("Estación incorrecta");
				}
				
		}else {
			switch (opcion) {
			case 2 : 
			case 3 : 
			case 4 : System.out.println ("Has elegido la opcion " + opcion);break;
			case 5: System.out.println ("Adiós!");break;
			default : System.out.println ("Opción incorrecta");
		}
		
				}
				
		}
}
