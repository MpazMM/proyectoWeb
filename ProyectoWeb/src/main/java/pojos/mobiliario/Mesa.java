package pojos.mobiliario;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="MS")
public class Mesa extends Mobiliario{
	
	private String estilo;

	
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Mesa(String nombre, double precio) {
		super(nombre, precio);
	}

	/**
	 * @param nombre
	 * @param precio
	 * @param estilo
	 */
	public Mesa(String nombre, double precio, String estilo) {
		super(nombre, precio);
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Mesa [" + (estilo != null ? "estilo=" + estilo : "") + "]";
	}

}
