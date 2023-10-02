package mariapaz.munoz.examen;

public class Bebida {

	private String nombreBebida;
	private double precioBebida;


	public Bebida(String nombreBebida, double precioBebida) {
		super();
		this.nombreBebida = nombreBebida;
		this.precioBebida = precioBebida;
	}

	public String getNombreBebida() {
		return nombreBebida;
	}

	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}

	public double getPrecioBebida() {
		return precioBebida;
	}
	
	
}
