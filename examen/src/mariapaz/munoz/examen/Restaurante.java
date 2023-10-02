package mariapaz.munoz.examen;

import java.util.Scanner;

public class Restaurante {

	private String nombreRestaurante;
	private Carta[] cartas;

	public Restaurante(String nombreRestaurante) {
		super();
		this.nombreRestaurante = nombreRestaurante;
	}

	public String getNombreRestaurante() {
		return nombreRestaurante;
	}

	public void setNombreRestaurante(String nombreRestaurante) {
		this.nombreRestaurante = nombreRestaurante;
	}

	public static void main(String[] args) {

		// Preparación platos
		Plato plato1 = new Plato("Filete", 10.85, true);
		Plato plato2 = new Plato("Patatas bravas", 6.50, true);
		Plato plato3 = new Plato("Croquetas", 8.99, true);
		Plato plato4 = new Plato("Paella", 15.35, true);
		Plato plato5 = new Plato("Filete", 10.85, false);
		
		Plato[] platoCarta1 = { plato1, plato2, plato5 };
		Plato[] platoCarta2 = { plato4, plato3 };


		// Preparación bebidas
		Bebida bebida1 = new Bebida("Refresco", 3.50);
		Bebida bebida2 = new Bebida("Cerveza", 2.30);

		Bebida[] bebidaMenu = { bebida1, bebida2 };

		// Preparación cartas
		Carta carta1 = new Carta("Menú del día", platoCarta1, bebidaMenu);
		Carta carta2 = new Carta("Menú fin de semana", platoCarta2, bebidaMenu);

		Carta[] cartasRestaurante = { carta1, carta2 };
		

		Restaurante restaurante = new Restaurante("Bienvenido a casa Pepe");
		mostrarCarta(cartasRestaurante,carta1);
		eleccionMenu();

		
	}

	// Mostrar productos en carta
	public static void mostrarCarta(Carta[] cartas, Plato[] platos) {
		for (Carta carta : cartas) {
			System.out.println("Datos del " + carta.getNombreCarta());
			for (Plato plato : platos) {
				if (plato.isDisponiblePlato() != false) {
					System.out.println(plato.getNombrePlato() + "\t" + plato.getPrecioPlato());
				}
			}

		}
	}

	//Preguntar por el menú que quiere el cliente
	public void eleccionMenu () {
			System.out.println("¿Cuál es el menú que quieres elegir?");
			Scanner scan = new Scanner(System.in);
			int respuesta = scan.nextInt();
			System.out.println("Has elegido el menú " + respuesta);
	}
	
	//Importe de los productos de la carta seleccionada
	public void mostrarEscaparate (Carta[]cartas, Plato[] platos) {
		double precioTotal = 0;
		for (int i = 0; i<cartas.length; i++) {
			for (int j = 0; j<platos.length; j++)
			if(plato.isDisponiblePlato()!=false) {
				precioTotal += plato.getPrecio();
				System.out.println ("El precio del menú es " + precioTotal);
		}
	}
	
	
}
