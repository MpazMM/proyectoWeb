package es.curso.java.poo.orquesta.herencia;

public class Guitarra extends Instrumento{
	private int numCuerdas;

	public Guitarra(String nombre) {
		super(nombre, "Cuerda");
		numCuerdas = 6;
	}

	public Guitarra(String nombre, int numCuerdas) {
		super(nombre, "Cuerda");
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public void afinar () {
		System.out.println("Afinando " + getNombre());
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + "]";
	}
	
	
}
