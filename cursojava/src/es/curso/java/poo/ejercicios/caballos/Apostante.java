package es.curso.java.poo.ejercicios.caballos;

public class Apostante {
	
	private String nombre;
	private double saldo;
	private double apuesta;
	private int dorsoApuesta;

	

	public Apostante(String nombre, double saldo, double apuesta, int dorsoApuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
		this.dorsoApuesta = dorsoApuesta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getApuesta() {
		return apuesta;
	}

	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}

	public int getDorsoApuesta() {
		return dorsoApuesta;
	}
	
	

}
