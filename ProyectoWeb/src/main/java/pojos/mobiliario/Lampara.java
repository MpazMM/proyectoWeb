package pojos.mobiliario;

public class Lampara extends Mobiliario{
	
	private int potencia;

	/**
	 * @param nombre
	 * @param precio
	 * @param potencia
	 */
	public Lampara(String nombre, double precio, int potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	

}
