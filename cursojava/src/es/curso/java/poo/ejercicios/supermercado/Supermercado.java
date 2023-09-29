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

	public Cajera[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}

	public Producto[] getStock() {
		return stock;
	}

	public void setStock(Producto[] stock) {
		this.stock = stock;
	}

	public static void main(String[] args) {
		// Necesita un nombre ya que en el constructor me obliga a ponerlo
		Supermercado supermercado = new Supermercado("Supermercado MP");
		supermercado.abrirSupermercado();
		
		
		Cliente[] clienteCompra = new Cliente[3];
		
		supermercado.pintarSupermercado();
		clienteCompra[0] = new Cliente (1,"Pepe",true, supermercado.getStock(), supermercado.getCajeras()[1]);

		supermercado.pintarSupermercado();
		clienteCompra[1] = new Cliente (2,"María",false, supermercado.getStock(), supermercado.getCajeras()[0]);
		supermercado.pintarSupermercado();
		clienteCompra[2] = new Cliente (3,"Paco",false, supermercado.getStock(), supermercado.getCajeras()[0]);
		
	}

	// Abrir supermercado
	public void abrirSupermercado() {
		llenarStock();
		crearCajeras();
//		pintarSupermercado();
	}
	
	private void pintarSupermercado() {
		for (Producto producto : stock) {
			System.out.println(producto.getIdProducto() + "\t" + producto.getNombreProducto() + "\t" + producto.getPrecio() + "\t" + producto.getTipoProducto()  );
		}
	}
	
	//Stock
	private void llenarStock() {
		this.stock = new Producto[5];
		
		this.stock[0] = new Producto(1, "Producto 1", 3.45, "Lácteos");
		this.stock[1] = new Producto(2, "Producto 2", 10.10, "Carnicería");
		this.stock[2] = new Producto(3, "Producto 3", 4.85, "Frutería");
		this.stock[3] = new Producto(4, "Producto 4", 1.35, "Dulces");
		this.stock[4] = new Producto(5, "Producto 5", 9.95, "Congelados");

	}
	
	private void crearCajeras() {
		this.cajeras = new Cajera[2];
		
		this.cajeras[0] = new Cajera(1, "Jaime");
		this.cajeras[1] = new Cajera(2, "Patty");

	}

}
