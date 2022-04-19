package cl.icap.proyectofinal.m5.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id 
	@Column(name="idticket", nullable =false, length=50)
	private String idTicket;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idestado", referencedColumnName = "IDESTADO")
	private Estado estado;
	
	@Column(name="idusuario")
	private String idUsuario;
	
	@Column(name="fechacreacion")
	private String fechaCreacion;
	
	@Column(name="fechatermino")
	private String fechaTermino;
	
	@Column(name="tituloticket")
	private String tituloTicket;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idusuarioasignado", referencedColumnName = "IDUSUARIO")
	private Usuario usuario;

	public Ticket(String idTicket, Estado estado, String idUsuario, String fechaCreacion, String fechaTermino,
			String tituloTicket, Usuario usuario) {
		super();
		this.idTicket = idTicket;
		this.estado = estado;
		this.idUsuario = idUsuario;
		this.fechaCreacion = fechaCreacion;
		this.fechaTermino = fechaTermino;
		this.tituloTicket = tituloTicket;
		this.usuario = usuario;
	}

	public Ticket() {
		super();
	}

	public String getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getTituloTicket() {
		return tituloTicket;
	}

	public void setTituloTicket(String tituloTicket) {
		this.tituloTicket = tituloTicket;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

	
	
}
