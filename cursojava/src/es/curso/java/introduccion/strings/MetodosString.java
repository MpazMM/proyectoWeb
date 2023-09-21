package es.curso.java.introduccion.strings;

public class MetodosString {

	public static void main(String[] args) {
		
		String var1 = "Hola";
		String var2 = "Hola";
		String var8 = new String("Hola");
		System.out.println(var1==var2);
		System.out.println(var1.equals(var2));
		System.out.println(var1==var8);
		System.out.println(var1.equals(var8));
		
		

		String nombre1 = "Jose Luis";
		String nombre2 = nombre1;
		
		nombre1 = nombre1.toUpperCase();
		// Si pusiéramos sólo nombre1.toUpperCase(); no refenciamos el nuevo objeto 
		// por lo que pasa a ser basura
		
		System.out.println(nombre1);
		System.out.println(nombre2);

		System.out.println(nombre1.charAt(0));
		// Nos da como resultado el caracter que está en esa posición
		// Siempre se empieza en la posición 0
		
		System.out.println(nombre1.concat(nombre2));
		// Une ambos Strings, mismo resultado que el +
		
		String result = nombre1+"|"+nombre2+"|"+"Eva";
		System.out.println(result);
		
		System.out.println(nombre1.toLowerCase().contains("se") );
		//Para saber si contiene lo que le indiquemos
		
		System.out.println(nombre1.endsWith(".txt"));
		System.out.println(nombre1.startsWith("JO"));
		
		//"JOSE LUIS werwr"
		System.out.println(nombre1.indexOf("S")); 
		//Dame la posición donde se encuentre este caracter (recordar que empieza por 0)
		System.out.println(nombre1.lastIndexOf("S"));
		
		
		String var3 = "      ";
		System.out.println(var3.isBlank());
		// Si es un blanco
		System.out.println(var3.isEmpty());
		// Si está vacío
		
		System.out.println(nombre1.length());
		
		System.out.println(nombre1.replace("E", "I"));
		System.out.println(nombre1);
		
		String var4 = "EEEEE";
		System.out.println(var4.replace("E", "I"));
		
		
		
		
		String var5 = "    Esto es una prueba      ";
		String var6 = var5.substring(8);
		System.out.println(var6);
		String var7 = var5.substring(8,11);
		System.out.println(var7);
		
		System.out.println(var5.trim());
		//Quita espacios en blancos en la izquierda y la derecha
		
		
	}

}

