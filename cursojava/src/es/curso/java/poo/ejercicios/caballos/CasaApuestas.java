package es.curso.java.poo.ejercicios.caballos;

public class CasaApuestas {

	public static void main(String[] args) {

		// Creamos los caballos
		Caballo caballo1 = new Caballo(1, "Rocinante", 10, 5, 170, 400);
		Caballo caballo2 = new Caballo(2, "Spirit", 20, 6, 200, 230);
		Caballo caballo3 = new Caballo(3, "Abel", 30, 7, 250, 220);
		Caballo caballo4 = new Caballo(4, "Veloz", 40, 8, 210, 210);

		Caballo[] caballos = { caballo1, caballo2, caballo3, caballo4 };

		// Creamos las carreras
		Carrera carrera1 = new Carrera(10, "Nacional", caballos, 1000);
		Carrera carrera2 = new Carrera(20, "Europea", caballos, 1000);
		Carrera carrera3 = new Carrera(30, "Internacional", caballos, 2000);
		Carrera carrera4 = new Carrera(40, "Mundial", caballos, 1000);

		Carrera[] carreras = { carrera1, carrera2, carrera3, carrera4 };

		// Creamos el Gran Premio
		GranPremio granPremio = new GranPremio(123, "Gran Premio", carreras);

		// Creamos los apostantes
		Apostante apostante1 = new Apostante("Silvio", 1500, 100, 20);
		Apostante apostante2 = new Apostante("Lucio", 1500, 150, 10);

		Apostante[] apostantes = { apostante1, apostante2 };
		granPremio.empezarGranPremio(apostantes);
		
		System.out.println(apostante1.getSaldo() + " " + apostante2.getSaldo());

	}

}
