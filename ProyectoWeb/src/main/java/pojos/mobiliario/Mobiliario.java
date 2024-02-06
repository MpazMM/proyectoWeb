package pojos.mobiliario;

public abstract class Mobiliario {
	
	private String nombre;
	private double precio;
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Mobiliario(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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
