package cl.icap.proyectofinal.m5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estados")
public class Estado {
	
	@Id 
	private String Idestado;
	private String Estado;

	public Estado(String idestado, String estado) {
		
		Idestado = idestado;
		Estado = estado;
	}
	
	public Estado() {
	
	}
	
	public Estado(String idestado) {
	
		Idestado = idestado;
	}
	
	public String getIdestado() {
		return Idestado;
	}
	public void setIdestado(String idestado) {
		Idestado = idestado;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
}