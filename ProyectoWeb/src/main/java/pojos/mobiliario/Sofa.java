package pojos.mobiliario;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="SF")
public class Sofa extends Mobiliario {
	
	private String color;

	/**
	 * @param nombre
	 * @param precio
	 * @param estilo
	 */
	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String estilo) {
		this.color = estilo;
	}

	@Override
	public String toString() {
		return "Sofa [" + (color != null ? "color=" + color : "") + "]";
	}

}
