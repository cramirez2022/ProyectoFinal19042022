package cl.icap.proyectofinal.m5.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historicoticket")
public class HistoricoTicket {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="IDHISTORICO", nullable =false, length=50)
	private String idHistorico;
	
	@Column(name="IDTICKET")
	private String idTicketFK;
	
	@Column(name="MENSAJEHISTORICO")
	private String mensajeHistorico;
	
	

	public HistoricoTicket(String idHistorico, String idTicketFK, String mensajeHistorico) {
		super();
		this.idHistorico = idHistorico;
		this.idTicketFK = idTicketFK;
		this.mensajeHistorico = mensajeHistorico;
	}
	
	
	public HistoricoTicket() {
		super();
	}



	public String getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(String idHistorico) {
		this.idHistorico = idHistorico;
	}

	public String getIdTicketFK() {
		return idTicketFK;
	}

	public void setIdTicketFK(String idTicketFK) {
		this.idTicketFK = idTicketFK;
	}

	public String getMensajeHistorico() {
		return mensajeHistorico;
	}

	public void setMensajeHistorico(String mensajeHistorico) {
		this.mensajeHistorico = mensajeHistorico;
	}
	

	
}
