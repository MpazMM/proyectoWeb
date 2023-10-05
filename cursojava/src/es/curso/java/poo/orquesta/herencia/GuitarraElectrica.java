package es.curso.java.poo.orquesta.herencia;

public class GuitarraElectrica extends Guitarra{

	private int potencia;

	public GuitarraElectrica(String nombre, int potencia) {
		super(nombre);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void tocar () {
		super.tocar();
		System.out.println("Muy alto");
	}

}
