package es.curso.java.introduccion.arrays.ejercicios;

public class EjercicioArraysBidimensionales {

	public static void main(String[] args) {
		
		//Matriz 3 filas y 4 columnas
		String [][] animales = new String [3][4];
		
		//Si ponemos [3][4] saldría error ArrayIndexOut porque no tiene tantas posiciones
		//Sería [2][3]
		System.out.println(animales[2][1]);
		animales[0][0] = "Gato";
		
		//Me dice el número de filas cuando es bidimensional
		System.out.println(animales.length);
		//Numero de columnas de la fila 0
		System.out.println(animales[0].length);
		
		
		//Metemos información en el array
		for(int i = 0; i < animales.length; i++) {
			//System.out.println("Fila " + i);
            for(int j = 0; j < animales[i].length; j++) {
            	//System.out.println("\tColumna " + j);
            	animales[i][j] = "*";
                }
        }
		
		//Mostramos la información
		for(int i = 0; i < animales.length; i++) {
			//System.out.println("Fila " + i);
            for(int j = 0; j < animales[i].length; j++) {
            	System.out.print(animales[i][j]);
                }
            System.out.println();
            //Lo mismo que poner System.out.print("\n");
        }
         
		for( String [] fila : animales ) {
			for (String dato : fila) {
				System.out.println(dato);
			}
			System.out.println("\n");
		}
		
    }
	
}
