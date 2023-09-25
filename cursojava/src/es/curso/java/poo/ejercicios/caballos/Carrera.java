package es.curso.java.poo.ejercicios.caballos;

public class Carrera {
	
	private long id;
	private String nombre;
	private Caballo[]caballos;
	private int distancia;
	
	public Carrera(long id, String nombre, Caballo[] caballo, int distancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.caballos = caballo;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caballo[] getCaballo() {
		return caballos;
	}

	public void setCaballo(Caballo[] caballo) {
		this.caballos = caballo;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public long getId() {
		return id;
	}
	
	//Método iniciarCarrera
	public void iniciarCarrera() {
		
		boolean hayGanador = false;
		while (!hayGanador)
			for (Caballo cab : caballos){
				if(this.distancia>cab.getTotalRecorrido()) {
					cab.correr();
					hayGanador = true;
					break;
				}
		System.out.println("El caballo ganador es " + cab.getNombre());	
				
		}
		
	}

}
