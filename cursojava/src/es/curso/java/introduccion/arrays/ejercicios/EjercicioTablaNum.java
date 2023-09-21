package es.curso.java.introduccion.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioTablaNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Indica número de filas");
		int num = scan.nextInt();

		int[][] matriz = new int[num][num];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Indica el valor para la fila " + (i + 1) + " y columna " + (j + 1));
				matriz[i][j] = scan.nextInt();
			}

		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();			
		}
		
		int [] diagonal = new int[num];
		
		//1ª forma de resolver la diagonal
		for (int i= 0; i<num; i++) {
			diagonal[i]=matriz[i][i];
		}
		
		//2º forma de resolver la diagonal
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
			if (i==j) {
				diagonal[i]=matriz[i][j];
			}
		}
			
	}
		for (int numero : diagonal) {
			System.out.print(numero);
		}

	}
}
