package usuario.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.STRING)
@Table(name="TB_CUENTA")
public abstract class Cuenta {
		
		@Id
		@SequenceGenerator(name = "CUENTAGEN", sequenceName = "CUENTASEQ", initialValue = 1, allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUENTAGEN")
		@Column(name="NOMBRE", length = 15, nullable = false)
		private String nombre;
		@Column(name="APELLIDOS", nullable = false)
		private String apellidos;
		@Column(name="DNI" ,length = 9, nullable = false)
		private String dni;
		@Column(name="SEXO",length = 15, nullable = false)
		private String sexo;
		@Column(name="FECHA_NACIMIENTO", nullable = false)
		private Date fechaNacimiento;
		@Column(name="EMAIL", nullable = false)
		private String email;
		@Column(name="TELEFONO",length = 9, nullable = false)
		private int tlfUsuario;
		@Column(name="IDCUENTA", nullable = false)
		private String idCuenta;
		@Column(name="CONTRASEÑA", nullable = false)
		private String contrasenia;
		
		
		
		
		public Cuenta() {
			super();
		}


		public Cuenta(String nombre, String apellidos, String dni, String sexo, Date fechaNacimiento,
				String email, int tlfUsuario, String idCuenta, String contrasenia) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
			this.sexo = sexo;
			this.fechaNacimiento = fechaNacimiento;
			this.email = email;
			this.tlfUsuario = tlfUsuario;
			this.idCuenta = idCuenta;
			this.contrasenia = contrasenia;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellidos() {
			return apellidos;
		}


		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		public String getSexo() {
			return sexo;
		}


		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}


		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getTlfUsuario() {
			return tlfUsuario;
		}


		public void setTlfUsuario(int tlfUsuario) {
			this.tlfUsuario = tlfUsuario;
		}


		public String getContrasenia() {
			return contrasenia;
		}


		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;
		}


		public String getDni() {
			return dni;
		}


		public String getIdCuenta() {
			return idCuenta;
		}


		@Override
		public String toString() {
			return "Cuenta [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sexo=" + sexo
					+ ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", tlfUsuario=" + tlfUsuario
					+ ", idCuenta=" + idCuenta + ", contrasenia=" + contrasenia + "]";
		}
		
		

}
