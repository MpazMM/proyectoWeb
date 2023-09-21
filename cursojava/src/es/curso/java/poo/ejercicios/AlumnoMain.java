package es.curso.java.poo.ejercicios;

public class AlumnoMain {


		public static void main(String[] args) {
			
	
			Alumno p1 = new Alumno();
			p1.dni = "123";
			p1.nombre = "María";
			p1.apellidos = "Montaño García";
			p1.nota = 3;
			
			
			Alumno p2 = new Alumno("456","Raúl","Pérez Gzlez");
			p2.nota = 8;
			
			
			Alumno p3 = new Alumno("789","Rosa","Lopez Muñoz",10);
			
			
			//Método
			p1.estudiar();
			p2.estudiar();
			p3.estudiar();
			
			//Meter los objetos en un array
			Alumno [] alumnos = {p1, p2, p3};
			//Si el método no es estático hay que crear un objeto
			// para poder invocarlo
			AlumnoMain am = new AlumnoMain();
			am.pintarAprobados(alumnos);
		}
		
		public void pintarAprobados (Alumno [] alumnos) {
			
			for(Alumno alumno : alumnos) {
				System.out.println("Alumnos aprobados");
				if (alumno.nota >= 5) {
					System.out.println(alumno.dni);
					System.out.println(alumno.nombre);
					System.out.println(alumno.apellidos);
					System.out.println(alumno.nota);
				}
			}
			
		}
	
}
