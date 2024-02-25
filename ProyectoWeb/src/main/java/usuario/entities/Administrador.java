package usuario.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ADMIN")
public class Administrador extends Cuenta {
	private int tlfCorp;
	private String emailCorp;
	
	
	public Administrador() {
		super();
	}


	public Administrador(String nombre, String apellidos, String dni, String sexo, Date fechaNacimiento,
			String email, int tlfUsuario, String idCuenta, String contrasenia, int tlfCorp, String emailCorp) {
		super(nombre, apellidos, dni, sexo, fechaNacimiento, email, tlfUsuario, idCuenta, contrasenia);
		this.tlfCorp = tlfCorp;
		this.emailCorp = emailCorp;
	}


	public int getTlfCorp() {
		return tlfCorp;
	}


	public void setTlfCorp(int tlfCorp) {
		this.tlfCorp = tlfCorp;
	}


	public String getEmailCorp() {
		return emailCorp;
	}


	public void setEmailCorp(String emailCorp) {
		this.emailCorp = emailCorp;
	}


	@Override
	public String toString() {
		return "Administrador [tlfCorp=" + tlfCorp + ", emailCorp=" + emailCorp + "]";
	}
	
	
	
	
}
