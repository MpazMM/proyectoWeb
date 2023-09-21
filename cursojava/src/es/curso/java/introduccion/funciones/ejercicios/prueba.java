package es.curso.java.introduccion.funciones.ejercicios;

import es.curso.java.introduccion.utils.Utilidades;

public class prueba {

	final static String OPCIONES_MENU = "1. Insertar Alumno.:" + "2. Mostrar Alumnos por Aula:"
			+ "3. Mostrar todos los alumnos aprobado del colegio:" + "4. Buscar Alumno:" + "5. Borrar Alumno:"
			+ "6. Salir";

	final static String[] OPCIONES_MENU_ARRAY = { "1. Insertar Alumno.", "2. Mostrar Alumnos por Aula",
			"3. Mostrar todos los alumnos aprobado del colegio", "4. Buscar Alumno", "5. Borrar Alumno", "6. Salir" };

	public static void main(String[] args) {

		String[][] colegio = dimensionarColegio();

		int opcion = 0;
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU,"Introduce valor (1-6)",":");

			boolean alumnoEncontrado = false;
			String dni;

			switch (opcion) {
			case 1: // Insertar alumnos
				// Pedimos el aula donde se va a insertar el alumno
				int numAula = Utilidades.pideDatoNumerico("En qué aula quieres insertarlo? 1-" + colegio.length);
				String[] aula = colegio[numAula - 1];

				boolean claseLlena = true;
				for (int i = 0; i < aula.length; i++) {
					if (aula[i] == null) {
						System.out.println("Posición " + (i + 1) + " libre");
						claseLlena = false;
						String nombre = Utilidades.pideDatoTexto("Introduce el nombre");
						String dniNuevo = Utilidades.pideDatoTexto("Introduce el dni");
						String nota = Utilidades.pideDatoTexto("Introduce la nota");

						aula[i] = nombre + ":" + dniNuevo + ":" + nota;
						break;
					}
				}
				if (claseLlena) {
					System.out.println("El aula está llena");
				}

				break;
			case 2: // Mostrar Alumnos
				for (int i = 0; i < colegio.length; i++) {
					System.out.println("Aula: " + (i + 1));
					for (int j = 0; j < colegio[i].length; j++) {
						String[] datosAlumnosArray = getDatosAlumnos(colegio[i][j]);
						if (datosAlumnosArray != null && datosAlumnosArray.length > 0) {
							System.out.println("\t" + datosAlumnosArray[0] + " " + datosAlumnosArray[1] + " "
									+ datosAlumnosArray[2]);
						}
					}
				}

				break;
			case 3: // Mostrar aprobados

				System.out.println("============ Mostrando alumnos aprobados ============");
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						String[] datosAlumnosArray = getDatosAlumnos(colegio[i][j]);
						if (datosAlumnosArray != null && datosAlumnosArray.length > 0) {
							int nota = Integer.parseInt(datosAlumnosArray[2]);
							if (nota >= 5) {
								System.out.println("\t" + datosAlumnosArray[0] + " " + datosAlumnosArray[1] + " "
										+ datosAlumnosArray[2]);
							}
						}
					}
				}

				break;
			case 4: // Buscar por dni
				dni = Utilidades.pideDatoTexto("Introduce el dni del alumno a buscar");

				for (int i = 0; i < colegio.length && !alumnoEncontrado; i++) {
					for (int j = 0; j < colegio[i].length && !alumnoEncontrado; j++) {
						if (isDniCorrecto(colegio[i][j], dni)) {
							System.out.println("El alumnos está en el aula " + (i + 1));
							alumnoEncontrado = true;
						}
					}
				}
				if (!alumnoEncontrado) {
					System.out.println("El alumno con dni " + dni + " no está en el colegio");
				}

				break;
			case 5: // Borrar a partir de un dni
				dni = Utilidades.pideDatoTexto("Introduce el dni del alumno a borrar");

				for (int i = 0; i < colegio.length && !alumnoEncontrado; i++) {
					for (int j = 0; j < colegio[i].length && !alumnoEncontrado; j++) {
						if (isDniCorrecto(colegio[i][j], dni)) {
							colegio[i][j] = null;
							alumnoEncontrado = true;
							System.out.println("Alumno borrado");
						}
					}
				}
				if (!alumnoEncontrado) {
					System.out.println("El alumno con dni " + dni + " no está en el colegio");
				}

				break;
			case 6: // Salir
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción incorrecta");

			}

		} while (opcion != 6);

	}

	public static String[] getDatosAlumnos(String datosAlumno) {
		String[] datosAlumnosArray = null;
		if (datosAlumno != null) {
			datosAlumnosArray = datosAlumno.split(":");
		}
		return datosAlumnosArray;
	}

	public static boolean isDniCorrecto(String datosAlumno, String dni) {
		boolean correcto = false;
		if (datosAlumno != null) {
			String dniAlumno = datosAlumno.split(":")[1];
			correcto = dni.equalsIgnoreCase(dniAlumno);
		}
		return correcto;
	}

	public static String[][] dimensionarColegio() {
		int numAulas = Utilidades.pideDatoNumerico("Introduce el número de aulas del colegio");
		String[][] colegio = new String[numAulas][];
		for (int i = 0; i < colegio.length; i++) {
			int numAlumnos = Utilidades.pideDatoNumerico("Introduce el número de alumnos del aula " + (i + 1));
			colegio[i] = new String[numAlumnos];
		}
		return colegio;
	}
}
