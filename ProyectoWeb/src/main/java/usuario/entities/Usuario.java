package usuario.entities;

import java.util.Date;

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


	public Usuario(String nombre, String apellidos, String dni, String sexo, Date fechaNacimiento, String email,
			int tlfUsuario, String idCuenta, String contrasenia, String perfilUsuario) {
		super(nombre, apellidos, dni, sexo, fechaNacimiento, email, tlfUsuario, idCuenta, contrasenia);
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
