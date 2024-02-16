package usuario.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ADMIN")
public class Administrador extends Cuenta {
	private String tlfCorp;
	private String emailCorp;
	
	/**
	 * 
	 */
	public Administrador() {
		super();
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param sexo
	 * @param fechaNacimiento
	 * @param email
	 * @param telefono
	 * @param idCuenta
	 * @param contrasenia
	 * @param tlfCorp
	 * @param emailCorp
	 */
	public Administrador(String nombre, String apellidos, String dni, String sexo, Date fechaNacimiento, String email,
			int telefono, String idCuenta, String contrasenia, String tlfCorp, String emailCorp) {
		super(nombre, apellidos, dni, sexo, fechaNacimiento, email, telefono, idCuenta, contrasenia);
		this.tlfCorp = tlfCorp;
		this.emailCorp = emailCorp;
	}



	public String getTlfCorp() {
		return tlfCorp;
	}

	public void setTlfCorp(String tlfCorp) {
		this.tlfCorp = tlfCorp;
	}

	public String getEmailCorp() {
		return emailCorp;
	}

	public void setEmailCorp(String emailCorp) {
		this.emailCorp = emailCorp;
	}

}
