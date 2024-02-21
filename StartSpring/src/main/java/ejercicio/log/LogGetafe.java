package ejercicio.log;

public class LogGetafe {
	
	private int nivelLog;

	
	public int getNivelLog() {
		return nivelLog;
	}

	public void setNivelLog(int nivelLog) {
		this.nivelLog = nivelLog;
	}
	
	
	public void pintar (String msg) {
		if(nivelLog>=0) {
			System.out.println("Trace. " + msg);
		}else if(nivelLog>=1) {
			System.out.println("Debug. " + msg);
		}else if(nivelLog>=2) {
			System.out.println("Info. " + msg);
		}else if(nivelLog>=3) {
			System.out.println("Warning. " + msg);
		}else if(nivelLog>=4) {
			System.out.println("Error. " + msg);
		}else if(nivelLog>=5) {
			System.out.println("Fatal. " + msg);
		}
	}
	

}
