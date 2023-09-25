package es.curso.java.poo.ejercicios.maniqui;

import es.curso.java.poo.ejercicios.AlumnoMain;

public class Escaparate {
	
	public static void main (String [] args) {
		
		//Botones
		Boton boton1 = new Boton(1,"Redondo","Azul","Pequeño");
		Boton boton2 = new Boton(2,"Cuadrado","Amarillo","Grande");
		Boton boton3 = new Boton(11,"Cuadrado","Rojo","Mediano");
		
		Boton [] botones = {boton1,boton2,boton3};
		
		//Pantalon
		Pantalon pantalon1 = new Pantalon(3,"Negro",44,30.50,boton1);
		Pantalon pantalon2 = new Pantalon(4,"Blanco",40,25.90,boton2);
		
		//Camisa
		Camisa camisa1 = new Camisa (5, "Gris", 46, 31.90, botones);
		Camisa camisa2 = new Camisa (6, "Verde", 50, 41.75, botones);
		
		//Vestido
		Vestido vestido1 = new Vestido(7,"Beige",38,42.50);
		Vestido vestido2 = new Vestido(8,"Multicolor",48,38.50);
			
		//Maniquí
		Maniqui maniqui1 = new Maniqui(9,vestido1);
		Maniqui maniqui2 = new Maniqui(10,pantalon2,camisa1);
		
		              
		maniqui1.vestir (pantalon1,camisa2);
		System.out.println("El maniquí tiene un pantalón " +maniqui1.getPantalon().getColor() +" y una camisa " + maniqui1.getCamisa().getColor());
		
		maniqui2.vestir (vestido1);
		System.out.println("El maniquí tiene un vestido " +maniqui2.getVestido().getColor());
	
		Maniqui [] maniquies = {maniqui1, maniqui2};
		Escaparate am = new Escaparate();
		am.mostrarEscaparate(maniquies);


	}
	
	//Mostrar escaparate
	public void mostrarEscaparate (Maniqui [] maniquies) {
		double precioTotal = 0;
		for (Maniqui maniqui : maniquies) {
			if(maniqui.getVestido()!=null) {
				precioTotal = maniqui.getPantalon().getPrecio() + maniqui.getCamisa().getPrecio();
				System.out.println ("El precio del escaparate es " + precioTotal);
			}else if ((maniqui.getPantalon()!=null && maniqui.getCamisa()!=null)){
				precioTotal = maniqui.getVestido().getPrecio();
				System.out.println ("El precio del escaparate es " + precioTotal);
			}
		}
	}
	
}
