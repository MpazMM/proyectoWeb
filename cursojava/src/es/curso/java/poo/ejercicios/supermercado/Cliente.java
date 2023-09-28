package es.curso.java.poo.ejercicios.supermercado;

import es.curso.java.introduccion.utils.Utilidades;

public class Cliente {
	
	private long idCliente;
	private String nombreCliente;
	private Producto [] carritoCompra;
	private boolean vip;
	
	public Cliente(long idCliente, String nombreCliente, boolean vip) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.carritoCompra = new Producto [5];
		this.vip = vip;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Producto[] getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(Producto[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public long getIdCliente() {
		return idCliente;
	}
	
	Cliente cliente1 = new Cliente (11,"Pepe",true);
	Cliente cliente2 = new Cliente (22,"María",false);
	
	Cliente [] clienteCompra = {cliente1, cliente2};
	
	//Método añadirProductos

	public void anadirProductos (Producto [] carritoCompra) {
		
		boolean carritoLleno = true;
		for (int i= 0; i < this.carritoCompra.length ; i++) {
			if (carritoCompra[i] == null) {
				this.carritoCompra[i] = Utilidades.pideDatoNumerico(this.nombreCliente + "¿qué producto quieres añadir al carrito?");
				break;
			}
			if(carritoLleno) {
				System.out.println("El carrito está lleno");
			}
			
		}
	}
	
	
	//Método pagar
	
	

}
