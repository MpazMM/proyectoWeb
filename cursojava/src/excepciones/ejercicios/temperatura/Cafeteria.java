package excepciones.ejercicios.temperatura;

import java.util.Random;

public class Cafeteria {

	private String nombreCafeteria;


	public Cafeteria(String nombreCafeteria) {
		super();
		this.nombreCafeteria = nombreCafeteria;
	}

	public static void main(String[] args) {

		Cafeteria cafeteria = new Cafeteria("Rico café");
		cafeteria.abrirCafeteria();

	

	}

	// Método abrir cafetería
	// Crear taza café temperatura aleatoria
	// Crear cliente
	// Cliente tomarTazaCafe
	// Si el cliente se queja se le pone otra taza

	public void abrirCafeteria() {
		Random rd1 = new Random();
		double temperature = rd1.nextDouble(0, 100);
		CoffeCup tazaCafe = new CoffeCup(temperature);
		ClienteCafeteria cliente1 = new ClienteCafeteria("Manolo");
		try {
			cliente1.tomarTazaCafe(tazaCafe);
		} catch (TooColdTemperatureException e) {
			System.out.println("El cliente se ha quemado, quiere otro café");
		} catch (TooHotTemperatureException e) {
			System.out.println("El cliente se ha quejado de que el café está frío");
		}
		
		
	}

}
