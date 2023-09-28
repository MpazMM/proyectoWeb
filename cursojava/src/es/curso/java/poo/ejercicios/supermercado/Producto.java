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

	// MOVER EL MÉTODO STOCK A SUPERMERCADO
	public static Producto[] llenarStock() {
		Producto producto1 = new Producto(1, "Producto 1", 3.45, "Lácteos");
		Producto producto2 = new Producto(2, "Producto 2", 10.10, "Carnicería");
		Producto producto3 = new Producto(3, "Producto 3", 4.85, "Frutería");
		Producto producto4 = new Producto(4, "Producto 4", 1.35, "Dulces");
		Producto producto5 = new Producto(5, "Producto 5", 9.95, "Congelados");

		Producto[] supermercado = { producto1, producto2, producto3, producto4, producto5 };

		return supermercado;
	}
}
