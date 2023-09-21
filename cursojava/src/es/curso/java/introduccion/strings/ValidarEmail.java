package es.curso.java.introduccion.strings;

import java.util.Scanner;

public class ValidarEmail {

	public static void main(String[] args) {
		
		
		System.out.println("Introduce tu email.");
		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine();
		String mensajeError="";
		int posicionArroba = email.lastIndexOf("@");
		int posicionPunto = email.lastIndexOf(".");

		
		//Quitar los espacios antes o después del email
		//Se podría declarar String email = scan.nextLine();
		email = email.trim();
		
		//Comprobar si tiene una @
			if (email.indexOf("@")!=email.lastIndexOf("@") || 
					email.indexOf("@")==-1){
				mensajeError ="El email "+email+" debe tener @. ";
			}
		
		//Confirmar que no tiene espacios en blanco
			if (email.contains(" ")) {
				mensajeError += "No puede tener espacios en blanco. ";
			}
			
		//Tiene que haber al menos un punto
			if (!email.contains(".")) {
				mensajeError += "Debe contener . ";
			}
			
		//Tiene que haber dos caracteres mínimo entre la @ y el .
			if (posicionPunto-posicionArroba <= 2) {
				mensajeError += "El punto debe estar a más distancia del @. ";
			}
			
		//Después del último punto tiene que haber entre 2 y 6 caracteres
			
			if (email.length()-posicionPunto < 1 && email.length()-posicionPunto > 7) {
				mensajeError += "Después del último punto tiene que haber entre 2 y 6 caracteres";
		}
			
			if (mensajeError.isEmpty()) {
				System.out.println("El email "+email+ " es correcto");
			}else {
				System.out.println("El email "+email+ " es incorrecto");
				System.out.println(mensajeError);
			}
				
		
	}

}

