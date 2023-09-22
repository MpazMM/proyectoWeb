package es.curso.java.poo.ejercicios.maniqui;

public class Camisa {
	
	private long id;
	private String color;
	private String talla;
	private double precio;
	private Boton [] boton;
	
	public Camisa(long id, String color, String talla, double precio, Boton[] boton) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Boton[] getBoton() {
		return boton;
	}

	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}
	
	
	
	
}
