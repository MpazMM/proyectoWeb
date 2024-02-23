package usuario.entities;

import java.text.SimpleDateFormat;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "USUARIO")
public class Usuario extends Cuenta{
	private String perfilUsuario;

	/**
	 * 
	 */
	public Usuario() {
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
	 * @param perfilUsuario
	 */
	public Usuario(long id, String nombre, String apellidos, String dni, String sexo, SimpleDateFormat fechaNacimiento,
			String email, int tlfUsuario, String idCuenta, String contrasenia, String perfilUsuario) {
		super(id, nombre, apellidos, dni, sexo, fechaNacimiento, email, tlfUsuario, idCuenta, contrasenia);
		this.perfilUsuario = perfilUsuario;
	}



	/**
	 * @param perfil
	 */
	public Usuario(String perfilUsuario) {
		super();
		this.perfilUsuario = perfilUsuario;
	}

	public String getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(String perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}


	
	

}
