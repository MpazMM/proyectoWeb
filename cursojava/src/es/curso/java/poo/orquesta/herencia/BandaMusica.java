package es.curso.java.poo.orquesta.herencia;

public class BandaMusica {

	public static void main(String[] args) {

		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();

	}

	public void empezarConcierto() {
		Guitarra guitarra1 = new Guitarra("Guitarra1");
		Guitarra guitarra2 = new Guitarra("Guitarra2", 5);

		GuitarraElectrica guitarraElectrica3 = new GuitarraElectrica("Guitarra eléctrica3", 100);
		GuitarraElectrica guitarraElectrica4 = new GuitarraElectrica("Guitarra eléctrica4", 200);

		Piano piano1 = new Piano("Piano1", "Cuerda percutida", 7, "Cola");
		Piano piano2 = new Piano("Piano2", "Cuerda percutida", 8, "De pared");

		Tambor tambor1 = new Tambor("Tambor1", "Percusión", "Cuero");
		Tambor tambor2 = new Tambor("Tambor2", "Percusión", "Sintético");

		Instrumento[] instrumentos = { guitarra1, guitarra2, guitarraElectrica3, guitarraElectrica4, piano1, piano2,
				tambor1, tambor2 };
		afinarInstrumentos(instrumentos);
		tocarInstrumentos(instrumentos);
	}

	public void afinarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
	}

	public void tocarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Tambor) {
				((Tambor)instrumento).aporrear();
				//Tambor t1 = (Tambor)instrumento)
				//ti.aporrear();
			} else {
				instrumento.tocar();
			}
		}
	}

}
