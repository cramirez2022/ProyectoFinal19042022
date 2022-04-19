package cl.icap.proyectofinal.m5.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rolusuarios")
public class Rol {
	
	@Id 
	private String Idrol;
	private String Rolusuario;
	


	public Rol(String idrol, String rolusuario) {
		
		Idrol = idrol;
		Rolusuario = rolusuario;
	}
	
	public Rol() {
		
	}

	public String getIdrol() {
		return Idrol;
	}

	public void setIdrol(String idrol) {
		Idrol = idrol;
	}

	public String getRolusuario() {
		return Rolusuario;
	}

	public void setRolusuario(String rolusuario) {
		Rolusuario = rolusuario;
	}

	
}