package es.curso.java.poo.ejercicios.caballos;

public class Caballo {

	private long id;
	private String nombre;
	private int numero;
	private int edad;
	private int velocidad;
	private int peso;
	private int totalRecorrido;
	
	public Caballo(long id, String nombre, int numero, int edad, int velocidad, int peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getTotalRecorrido() {
		return totalRecorrido;
	}

	//Método correr
	public void correr () {
		double totalRecorrido = this.velocidad*((Math.random()*20)+10) - this.peso*((Math.random()*3)+1) - this.edad*this.peso*((Math.random()*3)+1);
		totalRecorrido += totalRecorrido > 0 ? totalRecorrido : 0;
	}
	
	
}
