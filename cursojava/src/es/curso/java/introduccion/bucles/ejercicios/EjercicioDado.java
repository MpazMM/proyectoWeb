package es.curso.java.introduccion.bucles.ejercicios;

public class EjercicioDado {
	public static void main(String[] args) {

	
		do {
			int dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			if (dado==6) {
				break;
			}
		}while (true);	
		
	}	
}
