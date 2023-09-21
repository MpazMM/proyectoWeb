package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales2 {
	public static void main(String[] args) {
		//Variable de tipo String y designamos como mes. Aplicar el resultado para que den las diferentes estaciones del años. 
		//Poner en el mes de agosto vacaciones de verano y diciembre vacaciones de invierno
		//Sólo un system out que me diga en qué estación del año estoy
		
		//Cojo texto de la consola
		System.out.println("Introduce un mes");
		Scanner scan = new Scanner(System.in);
		
				String mes ="Agosto";//scan.nextLine();
				String estacion = "";
			
				if(mes == "Enero" || mes == "Febrero" || mes == "Marzo") {		
					estacion = "Invierno";
				
				}else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") {		
					estacion = "Primavera";

				}else if (mes == "Julio" || mes == "Agosto" || mes == "Septiembre") {		
					estacion = "Verano";
						if(mes == "Agosto") {
							estacion += "\tVacaciones de verano";
						}
				}else if (mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre") {		
					estacion = "Otoño";
						if(mes == "Diciembre") {
							estacion += "\tVacaciones de invierno";
					}
				}else {
					estacion = "Mes incorrecto";
				}
				System.out.println(estacion);
		}
}
