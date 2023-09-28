package es.curso.java.poo.ejercicios.supermercado;

public class Supermercado {

	private String nombre;
	private Cajera[] cajeras;
	private Producto[] stock;

	public Supermercado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// Necesita un nombre ya que en el constructor me obliga a ponerlo
		Supermercado supermercado = new Supermercado("Supermercado MP");
		supermercado.abrirSupermercado();
	}

	// Abrir supermercado
	public void abrirSupermercado() {
		this.stock = Producto.llenarStock();
		for (Producto producto : stock) {
			System.out.println(producto.getIdProducto() + "\t" + producto.getNombreProducto() + "\t" + producto.getPrecio() );
		}
	}
	
	//Stock
	

}
