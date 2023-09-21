package es.curso.java.introduccion.bucles;

public class BuclesFor {
	public static void main(String[] args) {
		
//For está separado en 3 partes, separadas por ";"	
		/*En la primera parte declaramos las variables, una o más variables
		 *En el centro establecemos la condición en la cual ese bucle se tiene que ejecutar
		 *Por cada interacción que vaya haciendo el bucle cuál es el cambio que queramos
	  	 *que haga
		*/
//Si no se pone nada, se ejecuta en bucle
		
		//for( int num=0 ; num<=5 ; num++ ) {
		//System.out.println("Hola Mundo");
//		}
		
//		for (int num=0 ; num <= 50 ; num++ ) {
//		System.out.println(num);
//			}

		//Primera forma de que salgan los números pares y números impares
//		for (int num=0 ; num <= 50 ; num += 2 ) {
//		System.out.println(num + " " + (49-num));
//			}
		//Segunda forma de que salgan los números pares y números impares
//		for (int num=49 ; num >= 1 ; num -= 2 ) {
//		System.out.println(num + " " + (51-num));
//			}
		
		//Tercera forma de que salgan los números pares y números impares
		for (int numPar=0, numImpar=49; numPar<=50 ; numPar +=2, numImpar -=2) {
			System.out.println(numPar + " " + numImpar);
		}
		
		}
	}
