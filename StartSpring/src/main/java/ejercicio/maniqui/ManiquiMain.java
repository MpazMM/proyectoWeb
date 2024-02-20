package ejercicio.maniqui;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ManiquiMain {


	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EjercicioManiqui.xml");

		Camisa camisa = (Camisa)context.getBean("camisa1");
		System.out.println(camisa);
		Pantalon pantalon = (Pantalon)context.getBean("pantalon1");
		System.out.println(pantalon);
		Boton boton1 = (Boton)context.getBean("boton1");
		System.out.println(boton1);
		Boton boton2 = (Boton)context.getBean("boton2");
		System.out.println(boton2);
		
		System.out.println("=====================================");
		
		Map<String,List<Maniqui>> mapaManiquis = (Map<String,List<Maniqui>>)context.getBean("mapaManiquis");

		Set<String> maniquisGrupo = mapaManiquis.keySet();
		for (String grupoManiqui : maniquisGrupo) {
			System.out.println("ID Maniquies: "+grupoManiqui);
			List<Maniqui> maniquis = mapaManiquis.get(grupoManiqui);
			for (Maniqui maniqui : maniquis) {
				System.out.println("\t"+maniquis);
			}
		}
		
	}

}
