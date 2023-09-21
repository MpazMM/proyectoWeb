package es.curso.java.introduccion.funciones.ejercicios;

import es.curso.java.introduccion.utils.Utilidades;

public class Calculadora {
	
	final static String [] OPCIONES_MENU_ARRAY = {"1. Sumar","2. Restar",
			"3. Multiplicación", "4. División"
			, "5. Apagar"} ;
	
	
	
	public static void main(String[] args) {
		
		double resultado = 0;
		int opcion = 0;
		
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU_ARRAY,"Introduce operación a realizar");
			
			switch (opcion) {
				case 1: 
					resultado = sumar(resultado); 
					break;
				case 2: 
					resultado = restar(resultado); 
					break;
				case 3: 
					resultado = multiplicar(resultado); 
					break;
				case 4: 	
					resultado = dividir(resultado); 
					break;
				case 6: //Apagar
					System.out.println("Apagar");
					break;
				default:
					System.out.println("Opción incorrecta");
			}
			
		}while(opcion!=5);
		
	}
	
	public static double sumar (double resultado) {
		double num = Utilidades.pideDatoNumerico("Introduce número a sumar");
		resultado += num;
		System.out.println(resultado);
		return resultado;
	}
	
	public static double restar (double resultado) {
		double num = Utilidades.pideDatoNumerico("Introduce número a restar");
		resultado -= num;
		System.out.println(resultado);
		return resultado;
	}
	
	public static double multiplicar (double resultado) {
		double num = Utilidades.pideDatoNumerico("Introduce número a multiplicar");
		num = resultado*num;
		return num;
	}

	public static double dividir (double resultado) {
		double num = Utilidades.pideDatoNumerico("Introduce número a dividir");
		if(num != 0) {
			num = resultado/num;
		}else {
			System.out.println("No puedes dividir un número entre 0");
		}
		return num;
	}
}
