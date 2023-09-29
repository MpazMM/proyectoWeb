package es.curso.java.poo.ejercicios.supermercado;

import es.curso.java.introduccion.utils.Utilidades;

public class Cliente {
	
	private long idCliente;
	private String nombreCliente;
	private int[] carritoCompra;
	private boolean vip;
	
	public Cliente(long idCliente, String nombreCliente, boolean vip, Producto[] productos, Cajera cajera) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.carritoCompra = new int[5];
		this.vip = vip;
		anadirProductos(productos, cajera);
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int[] getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(int[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
	
	//Método añadirProductos

	public void anadirProductos (Producto[] productos, Cajera cajera) {
		
		for (int i= 0; i < this.carritoCompra.length ; i++) {
			this.carritoCompra[i] = Utilidades.pideDatoNumerico(this.nombreCliente + " ¿qué producto quieres añadir al carrito?");		
		}
		System.out.println("El carrito está lleno");
		
		pagar(productos, cajera);
	}
	
	
	//Método pagar
	public void pagar(Producto[] productos, Cajera cajera) {
		double total = cajera.totalCompra(productos, carritoCompra);
		System.out.println("Total a pagar: " + total + "\n");
	}
	

}
