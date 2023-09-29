package es.curso.java.poo.ejercicios.supermercado;

public class Producto {

	private long idProducto;
	private String nombreProducto;
	private double precio;
	private String tipoProducto;

	public Producto(long idProducto, String nombreProducto, double precio, String tipoProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public double getPrecio() {
		return precio;
	}
}
