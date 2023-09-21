package es.curso.java.introduccion.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioAulasColegio {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuántas aulas tiene el colegio?");
		int aulas = scan.nextInt();
		
		String [][] alumnos = new String [aulas][];
		
		for (int i = 0; i < aulas; i++) {
			System.out.println("Indica el número de los alumnos del aula " + (i+1));
			scan = new Scanner(System.in);
			alumnos [i] = new String[scan.nextInt()];
		}
		
		String nombreAlumno = "";
		String dniAlumno = "";
		String notaAlumno = "";
	
		
		//Pido los datos (nombre, dni, nota media)
		for (int i = 0; i < aulas; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.println("Indica el nombre del alumno para la clase " + (i + 1) + " y asiento " + (j + 1));
				scan = new Scanner(System.in);
				nombreAlumno = scan.nextLine();
				System.out.println("Indica su DNI");
				scan = new Scanner(System.in);
				dniAlumno = scan.nextLine();
				System.out.println("Indica su nota media");
				scan = new Scanner(System.in);
				notaAlumno = scan.nextLine();
				alumnos [i][j] = nombreAlumno + ":" + dniAlumno + ":" + notaAlumno;
				
				}
			}
		
		
		//Mostrar los datos de todos los alumnos del colegio por aula
		
		int alumnosAprobados = 0;
		int indice = 0;
		
		for (int i = 0; i < aulas; i++) {
			System.out.print("Aula " + (i+1) + "\n");
			for (int j = 0; j < alumnos[i].length; j++) {
				String [] alumnosInfo = alumnos[i][j].split(":");
				notaAlumno = alumnosInfo[alumnosInfo.length - 1];
				int nota = Integer.parseInt(notaAlumno);
				
				for (String informacion : alumnosInfo) {
					System.out.print(informacion + "\t");
					
					if (nota>=5) {
						alumnosAprobados [indice] = informacion;
						indice++;
					}
				}
		
			}
		System.out.println();			
		}
	
		
	}

}
