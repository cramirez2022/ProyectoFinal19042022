package cl.icap.proyectofinal.m5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id 
	
	@Column(name="IDUSUARIO")
	private String IdUsuario;
	private String Idrol;
	private String nombreusuario;
	private String Passwordusuario;
	private String email;
	
	public Usuario(String idUsuario, String idrol, String nombreusuario, String passwordusuario, String email) {
		
		IdUsuario = idUsuario;
		Idrol = idrol;
		this.nombreusuario = nombreusuario;
		Passwordusuario = passwordusuario;
		this.email = email;
	}
	public Usuario() {
		
	}	
	public String getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getIdrol() {
		return Idrol;
	}
	public void setIdrol(String idrol) {
		Idrol = idrol;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getPasswordusuario() {
		return Passwordusuario;
	}
	public void setPasswordusuario(String passwordusuario) {
		Passwordusuario = passwordusuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
