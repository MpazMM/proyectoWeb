package es.curso.java.poo.ejercicios.caballos;

public class GranPremio {
	
	private long id;
	private String nombre;
	private Carrera [] carrera;
	
	public GranPremio(long id, String nombre, Carrera[] carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
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
	
	
	

}
