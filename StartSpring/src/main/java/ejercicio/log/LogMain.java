package ejercicio.log;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogMain {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("EjercicioLogGetafe.xml");
		
		LogGetafe logGetafe=(LogGetafe)context.getBean("LogGetafe");
		System.out.println("Nivel log: "+logGetafe.getNivelLog());
		
		Calculadora calculadora=(Calculadora)context.getBean("Calculadora");
		System.out.println("Nivel log: "+calculadora.getLog());
		calculadora.sumar();
	

	}

}
