package ejercicio.maniqui;

public class Maniqui {
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	
	/**
	 * 
	 */
	public Maniqui() {
		super();
	}

	/**
	 * @param id
	 * @param camisa
	 * @param pantalon
	 */
	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	@Override
	public String toString() {
		return "ManiquiProfe [id=" + id + ", " + (camisa != null ? "camisa=" + camisa + ", " : "")
				+ (pantalon != null ? "pantalon=" + pantalon : "") + "]";
	}
	
	

}