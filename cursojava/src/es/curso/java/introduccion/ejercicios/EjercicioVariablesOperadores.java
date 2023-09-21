package es.curso.java.introduccion.ejercicios;

/*Declarar 3 variables:
 * + 2 de tipo String nombre y apellidos
 * + 1 de tipo int anioNacimiento
 * Inicializar las variables
 * Mostrar los datos con la edad del usuario e indicando con true o false 
 * si el año es par o impar
 */
public class EjercicioVariablesOperadores {
	public static void main(String[] args) {

		// Declarado e inicializado las variables
		String nombre = "Mari Paz";
		String apellidos = "Muñoz Mata";
		int anioNacimiento = 1990;

		int edad = 2023 - anioNacimiento;
		boolean anioEsPar = (anioNacimiento % 2) == 0;

		System.out.print("El usuario " + nombre + " " + apellidos + " tiene " + edad + " años y \nnacio en un año ");
		// Otra forma de hacerlo
				/*System.out.print("El usuario " + nombre + " " + apellidos + " tiene " + (2023 - anioNacimiento)
				 *		+ " años y \nnacio en un año par " + ((anioNacimiento % 2) == 0));
				 */
		
		if ((anioNacimiento % 2) == 0) {
			System.out.print("par");
		}else {
			System.out.print("impar");
		}		
		
		
		
		
		
	}
}
