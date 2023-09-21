package es.curso.java.introduccion.utils;

import java.util.Scanner;

public class Menu {
	
	
	public static void main (String [] args){
		
		System.out.println("Introduce tu año de nacimiento.");
		String textoIntroducido = "";
		System.out.println(pideDatosString(textoIntroducido));
	}
	
	
	public static String pideDatosString (String texto) {
		Scanner scan = new Scanner(System.in);
			texto = scan.nextLine();
		return texto;
		
	}

}
