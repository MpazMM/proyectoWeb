package ejercicio.herencia;

public class Persona {
	
	
	/*private ServicioPrensa
	 * Sólo se crea cuando se le necesita y tiene scope Singleton
	 * (lazy) 
	 *
	 * Otra clase con:
	 * 	List<String> periodicos; Meter 5-6 periodicos
	 * 	List <String> mostrarPrensa(String tipoSuscripcion) 
	 * 	Muestra los periódicos
	 * 		free (1 periódicos)
	 * 		basic (3 periódicos)
	 * 		premium (6 periódicos)
	 *	void leerPeriodico (String periodico)
	 *		Sysout("leyendo el periodico elegido)
	 *=====================================================================
	 * La persona método solicitarLectura()
	 * 		Este método va a llamar ServicioPrensa.mostrarPrensa con el tipo
	 * 		de suscripción de persona
	 * 		servicioPrensa.mostrarPrensa(String tipoSuscripcion)
	 *
	 *	    leer (String titulo)
	 *  	servicioPrensa.leerPeriodico(titulo)
	*/
	

	private ServicioPrensa servP;
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	private String tipoSuscripcion; //free,basic,premium
	
	

	
	

}
