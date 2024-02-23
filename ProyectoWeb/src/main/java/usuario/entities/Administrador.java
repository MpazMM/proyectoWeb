package usuario.entities;

import java.text.SimpleDateFormat;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ADMIN")
public class Administrador extends Cuenta {
	private int tlfCorp;
	private String emailCorp;
	
	/**
	 * 
	 */
	public Administrador() {
		super();
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param sexo
	 * @param fechaNacimiento
	 * @param email
	 * @param tlfUsuario
	 * @param idCuenta
	 * @param contrasenia
	 * @param tlfCorp
	 * @param emailCorp
	 */
	public Administrador(long id, String nombre, String apellidos, String dni, String sexo, SimpleDateFormat fechaNacimiento,
			String email, int tlfUsuario, String idCuenta, String contrasenia, int tlfCorp, String emailCorp) {
		super(id, nombre, apellidos, dni, sexo, fechaNacimiento, email, tlfUsuario, idCuenta, contrasenia);
		this.tlfCorp = tlfCorp;
		this.emailCorp = emailCorp;
	}



	/**
	 * @param tlfCorp
	 * @param emailCorp
	 */
	public Administrador(int tlfCorp, String emailCorp) {
		super();
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
		return "Administrador [tlfCorp=" + tlfCorp + ", " + (emailCorp != null ? "emailCorp=" + emailCorp : "") + "]";
	}

	
	
}
