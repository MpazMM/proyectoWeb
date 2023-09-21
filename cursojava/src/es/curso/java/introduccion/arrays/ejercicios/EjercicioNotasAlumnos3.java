package es.curso.java.introduccion.arrays.ejercicios;

public class EjercicioNotasAlumnos3 {

	public static void main(String[] args) {
		
		int totalAprobados = 0;
		String alumnosNotas [] = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4"};

		
		//Mostrar el índice de alumnos
		for ( int i=0 ; i<alumnosNotas.length ; i++ ) {
			String dato = alumnosNotas[i];
			//System.out.println(dato);	
			int posicionDosPuntos = dato.lastIndexOf(":");
			String nombre = dato.substring(0,posicionDosPuntos);
			String notaStr = dato.substring(posicionDosPuntos+1);
			System.out.println("Nombre " + nombre);	
			System.out.println("Nota " + notaStr);	

			int nota = Integer.parseInt(notaStr);

			
			if (nota>=5) {
				totalAprobados++;
			}
			
		}
		
		String [] alumnosAprobados = new String [totalAprobados];
		for ( int i=0 ; i<alumnosNotas.length ; i++ ) {
			String dato = alumnosNotas[i];
			int posicionDosPuntos = dato.lastIndexOf(":");
			String nombre = dato.substring(0,posicionDosPuntos);
			String notaStr = dato.substring(posicionDosPuntos+1);

			int nota = Integer.parseInt(notaStr);

			
			if (nota>=5) {
				System.out.println("Han aprobado el " + nombre + " con una nota " + nota);	
			}
		}
	
	}
}
