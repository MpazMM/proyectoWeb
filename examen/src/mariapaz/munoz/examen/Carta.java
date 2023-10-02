package mariapaz.munoz.examen;

public class Carta {
	
	private String nombreCarta;
	private Plato [] plato;
	private Bebida [] bebidas;
	
	
	public Carta(String nombreCarta, Plato[] plato) {
		super();
		this.nombreCarta = nombreCarta;
		this.plato = plato;
	}
	
	public Carta(String nombreCarta, Plato[] plato, Bebida[] bebidas) {
		super();
		this.nombreCarta = nombreCarta;
		this.plato = plato;
		this.bebidas = bebidas;
	}

	public String getNombreCarta() {
		return nombreCarta;
	}

	public void setNombreCarta(String nombreCarta) {
		this.nombreCarta = nombreCarta;
	}

	public Plato[] getPlato() {
		return plato;
	}

	public void setPlato(Plato[] plato) {
		this.plato = plato;
	}

	public Bebida[] getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
		
}
