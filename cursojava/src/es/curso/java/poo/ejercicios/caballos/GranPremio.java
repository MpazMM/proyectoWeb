package es.curso.java.poo.ejercicios.caballos;

public class GranPremio {

	private long id;
	private String nombre;
	private Carrera[] carrera;

	public GranPremio(long id, String nombre, Carrera[] carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera[] getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera[] carrera) {
		this.carrera = carrera;
	}

	public long getId() {
		return id;
	}

	public Apostante[] empezarGranPremio(Apostante[] apostantes) {
		for (Carrera competicion : carrera) {
			int dorsoGanador = competicion.iniciarCarrera();
			for (int i = 0; i < apostantes.length; i++) {
				if (dorsoGanador != apostantes[i].getDorsoApuesta()) {
					double apuestaPerdida = apostantes[i].getSaldo() - apostantes[i].getApuesta();
					apostantes[i].setSaldo(apuestaPerdida);
				} else {
					double apuestaGanada = (apostantes[i].getSaldo() - apostantes[i].getApuesta())
							+ apostantes[i].getApuesta() * 5;
					apostantes[i].setSaldo(apuestaGanada);
					System.out.println("Enhorabuena " + apostantes[i].getNombre() + "¡has ganado! Tu saldo actual es "
							+ apostantes[i].getSaldo());

				}
			}
		}

		return apostantes;
	}
}
