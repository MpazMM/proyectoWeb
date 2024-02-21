package ejercicio.log;

public class LogGetafe {
	
	private int nivelLog;

	
	public int getNivelLog() {
		return nivelLog;
	}

	public void setNivelLog(int nivelLog) {
		this.nivelLog = nivelLog;
	}
	
	public void trace (String msg) {
			System.out.println("Trace. " + msg);
	}
	
	public void debug (String msg) {
			System.out.println("Debug. " + msg);
	}
	
	public void info (String msg) {
			System.out.println("Info. " + msg);
	}
	
	public void warning (String msg) {
			System.out.println("Warning. " + msg);
	}
	
	public void error (String msg) {
			System.out.println("Error. " + msg);
	}
	
	public void fatal (String msg) {
			System.out.println("Fatal. " + msg);
	}
	

}
