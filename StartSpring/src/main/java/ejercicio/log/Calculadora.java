package ejercicio.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Calculadora {

	@Qualifier("LogGetafe1")
	@Autowired
	private LogGetafe log;
	private int operador1;
	private int operador2;
	
	
	public LogGetafe getLog() {
		return log;
	}
	public void setLog(LogGetafe log) {
		this.log = log;
	}
	public int getOperador1() {
		return operador1;
	}
	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}
	public int getOperador2() {
		return operador2;
	}
	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}
	
	
	
	public void sumar(){
	    log.pintar("El resultado es "+(operador1+operador2));
	}	
	
}