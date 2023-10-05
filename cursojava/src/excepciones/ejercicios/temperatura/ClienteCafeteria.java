package excepciones.ejercicios.temperatura;

public class ClienteCafeteria {

	private String nombreCliente;

	public ClienteCafeteria(String nombreCliente) {
		super();
		this.nombreCliente = nombreCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	// Método tomar taza de café
	void tomarTazaCafe(CoffeCup coffeCliente) throws TooColdTemperatureException, TooHotTemperatureException {
		if (coffeCliente.getTemperature() < 20) {
			throw new TooColdTemperatureException();
		} else if (coffeCliente.getTemperature() > 80) {
			throw new TooHotTemperatureException();
		} else {
			System.out.println("El cliente " + this.nombreCliente + " se está tomando la taza de café a "
					+ coffeCliente.getTemperature());
		}
	}

}
