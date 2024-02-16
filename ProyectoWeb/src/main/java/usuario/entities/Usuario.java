package usuario.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "USUARIO")
public class Usuario extends Cuenta{
	private boolean invitado;

	/**
	 * 
	 */
	public Usuario() {
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
	 * @param invitado
	 */
	public Usuario(String nombre, String apellidos, String dni, String sexo, Date fechaNacimiento, String email,
			int telefono, String idCuenta, String contrasenia, boolean invitado) {
		super(nombre, apellidos, dni, sexo, fechaNacimiento, email, telefono, idCuenta, contrasenia);
		this.invitado = invitado;
	}

	public boolean isInvitado() {
		return invitado;
	}

	public void setInvitado(boolean invitado) {
		this.invitado = invitado;
	}
	
	

}
