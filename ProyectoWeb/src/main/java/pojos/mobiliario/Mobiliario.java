package pojos.mobiliario;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.STRING)
@Table(name="TB_MOBILIARIO")
public abstract class Mobiliario implements Serializable{
	
	@Id
	@SequenceGenerator(name = "MOBILIARIOGEN", sequenceName = "MOBILIARIO_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOBILIARIOGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	private String nombre;
	private double precio;

	/**
	 * 
	 */
	public Mobiliario() {
		super();
	}

	/**
	 * @param nombre
	 * @param precio
	 */
	public Mobiliario(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	
	
	
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Mobiliario [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio + "]";
	}
	

}
