package es.curso.java.introduccion.ejercicios;

public class EjercicioCondicionales {
	public static void main(String[] args) {
		//Variable de tipo String y designamos como mes. Aplicar el resultado para que den las diferentes estaciones del años. 
		//Poner en el mes de agosto vacaciones de verano y diciembre vacaciones de diciembre
		//Sólo un system out que me diga en qué estación del año estoy
				
				String mes ="Febrero";
				
			
				if(mes == "Enero" || mes == "Febrero" || mes == "Marzo") {		
					System.out.println("Invierno");
				
				}else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") {		
					System.out.println("Primavera");

				}else if (mes == "Julio" || mes == "Agosto" || mes == "Septiembre") {		
					System.out.println("Verano");
						String estacion = "Verano";
						if(mes == "Agosto") {
							estacion += ". Vacaciones de verano";
						}
						System.out.println(estacion);
				}else if (mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre") {		
					System.out.println("Otoño");
						String estacion = "Otoño";
						if(mes == "Diciembre") {
							estacion += ". Vacaciones de Navidad";
						}
						System.out.println(estacion);
					
				}else {
				System.out.println("Mes incorrecto");
			
		}
	}
}
