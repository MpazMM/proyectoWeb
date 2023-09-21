package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCollatzWhile {
	public static void main(String[] args) {

//		Con while tiene que estar declarada la variable fuera. Primero comprueba y después ejecuta.
//		El "do while" ejecuta primero, mínimo una vez, y luego se va a revisar la condición. 
//		Por ejemplo, un menú. Primero se pinta el menú y según lo que indique el usuario se ejecuta
		int num = 0;
		
		System.out.println("Indica un número");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		while (num!=1) {	
			num = num%2==0 ? num/=2 : num*3+1;
			System.out.println(num);
		}
	}
}
