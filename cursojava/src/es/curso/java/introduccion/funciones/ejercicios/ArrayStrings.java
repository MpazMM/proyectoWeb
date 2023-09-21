package es.curso.java.introduccion.funciones.ejercicios;

import java.util.Scanner;

public class ArrayStrings {

	public static void main (String [] args){

			//for (String dato: juntaDatos("Hola",8)); {
//			 String [] datos = juntaDatos ("Hola", 4);
//			 for (String dato : datos) {
//				System.out.println(dato);	
//				}
			 
			 //Difícil
			 String [] datosDificil = juntaDatosDificil  ("Hola",7);
			 for (String dato:datosDificil) {
				 System.out.println(dato);
			 }
			 
			}
				
				
	//Fácil
//	public static String [] juntaDatos (String texto, int numRepeticiones) {		 
//		String [] datos = new String [numRepeticiones];
//		for( int i=0 ; i < datos.length ; i++ ) {
//			datos [i] = texto;
//		}
//		return datos;
//		
//	}
	
	//Difícil
	public static String [] juntaDatosDificil (String texto, int numRepeticiones) {	
		
		//Primero condición, después del ? el resultado sí se cumple y : si no se cumple
		int tamanio = texto.length() >= numRepeticiones?numRepeticiones:texto.length();
		
		//Con if
//		int tamanio2 = 0;
//		if (texto.length()>=numRepeticiones) {
//			tamanio2 = numRepeticiones;
//		}else {
//			tamanio2 = texto.length();
//		}
		
	
		String [] datos = new String [tamanio];
		for( int i=0 ; i < datos.length ; i++ ) {
			datos [i] = texto.substring(0,texto.length()-i);
		}
		return datos;
		
	}
		
	
	//SOBRECARGA DE MÉTODOS. Métodos que tienen el mismo nombre pero diferente
	// número y/o tipo de parámetros
	public static String [] juntaDatos (String texto) {		 
		String [] datos = new String [4];
		for( int i=0 ; i < datos.length ; i++ ) {
			datos [i] = texto;
		}
		return datos;
		
	}
	

	
}