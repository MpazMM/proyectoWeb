package mariapaz.munoz.examen;


public class Plato {
	
	private String nombrePlato;
	private double precioPlato;
	private boolean disponiblePlato;
	
	public Plato(String nombrePlato, double precioPlato, boolean disponiblePlato) {
		super();
		this.nombrePlato = nombrePlato;
		this.precioPlato = precioPlato;
		this.disponiblePlato = disponiblePlato;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public boolean isDisponiblePlato() {
		return disponiblePlato;
	}

	public void setDisponiblePlato(boolean disponiblePlato) {
		this.disponiblePlato = disponiblePlato;
	}

	public double getPrecioPlato() {
		return precioPlato;
	}
	
	
}
