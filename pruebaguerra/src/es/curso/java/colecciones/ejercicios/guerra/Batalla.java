package es.curso.java.colecciones.ejercicios.guerra;

import java.util.Arrays;
import java.util.List;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;
import es.curso.java.colecciones.ejercicios.guerra.exceptions.UnidadesPermitadasException;

public class Batalla {

	public static void main(String[] args) {
		
		//Creación batallón
		List<Guerrero> guerreros = null;
		try {
			Guerrero guerrero1 = new Guerrero("G1","T1",10,0);
			Guerrero guerrero2 = new Guerrero("G2","T1",10,0);
			Guerrero guerrero3 = new Guerrero("G3","T1",10,0);
			Guerrero guerrero4 = new Guerrero("G4","T1",10,0);
			Guerrero guerrero5 = new Guerrero("G5","T1",10,0);
			Guerrero guerrero6 = new Guerrero("G6","T1",10,0);
			Guerrero guerrero7 = new Guerrero("G7","T1",10,0);
			Guerrero guerrero8 = new Guerrero("G8","T1",10,0);
			Guerrero guerrero9 = new Guerrero("G9","T1",10,0);
			Guerrero guerrero10 = new Guerrero("G10","T1",10,0); 
			
			guerreros = Arrays.asList(guerrero1,guerrero2,guerrero3,
					guerrero4,guerrero5,guerrero6,guerrero7,
					guerrero8,guerrero9,guerrero10);
			
		}catch (LimiteValoresException lve) {
			System.err.println("Error generando guerreros " + lve.getMessage());
			lve.printStackTrace();
		}
		
		//Creacion coche
		Coche coche=null;
		try {
			coche = new Coche ("Batmovil",9,1);
		
			for(Guerrero guerrero : guerreros ) {
				coche.embarcarGuerro(guerrero);
			}
		} catch (LimiteValoresException | UnidadesPermitadasException e) {
			e.printStackTrace();
		}
		
		GuerraMain gm = new GuerraMain();
		gm.empezarGuerra(coche);
		
	}

	
}
