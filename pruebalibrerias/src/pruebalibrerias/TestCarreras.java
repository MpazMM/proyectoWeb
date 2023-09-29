
package pruebalibrerias;

import es.curso.java.poo.ejercicios.caballos.Caballo;
import es.curso.java.poo.ejercicios.caballos.GranPremio;

public class TestCarreras {
	
		public static void main (String [] args) {
			
			Caballo caballo = new Caballo(0, "Caballo G", 1, 6, 80, 200);
			GranPremio gp = new GranPremio();
			gp.iniciarGranPremio(caballo);
			
		}
}
