package pojos.mobiliario;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="LMP")
public class Lampara extends Mobiliario{
	
	private double potencia;
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Lampara(String nombre, double precio) {
		super(nombre, precio);
	}

	/**
	 * @param nombre
	 * @param precio
	 * @param potencia2
	 */
	public Lampara(String nombre, double precio, double potencia2) {
		super(nombre, precio);
		this.potencia = potencia2;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	

}
