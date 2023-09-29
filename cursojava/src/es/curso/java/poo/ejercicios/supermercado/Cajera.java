package es.curso.java.poo.ejercicios.supermercado;

public class Cajera {

	private long idCajera;
	private String nombreCajera;
	
	public Cajera(long idCajera, String nombreCajera) {
		super();
		this.idCajera = idCajera;
		this.nombreCajera = nombreCajera;
	}

	public String getNombreCajera() {
		return nombreCajera;
	}

	public void setNombreCajera(String nombreCajera) {
		this.nombreCajera = nombreCajera;
	}

	public long getIdCajera() {
		return idCajera;
	}
	
	//Cobrar al cliente
	public double totalCompra(Producto[] stock, int[] compra) {
		double total = 0;
		
		for(int i = 0; i < compra.length; i++) {
			total += stock[--(compra[i])].getPrecio();
		}
		
		return total;
	}
	
	
}
