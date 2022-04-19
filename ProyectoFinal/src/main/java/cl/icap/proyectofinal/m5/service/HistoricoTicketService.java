package cl.icap.proyectofinal.m5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.icap.proyectofinal.m5.model.HistoricoTicket;
import cl.icap.proyectofinal.m5.model.Ticket;
import cl.icap.proyectofinal.m5.repository.HistoricoTicketRepository;
import cl.icap.proyectofinal.m5.repository.TicketRepository;



@Service
@Transactional
public class HistoricoTicketService {

	@Autowired
	private HistoricoTicketRepository repo5;
	
	public List<HistoricoTicket> listAll() {
		return repo5.findAll();
	}
	
	public void save(HistoricoTicket historicoTicket) {
		repo5.save(historicoTicket);
	}
	
	public HistoricoTicket get(String idHistorico) {
		return repo5.findById(idHistorico).get();
	}
	
	public void delete(String idHistorico) {
		repo5.deleteById(idHistorico);
	}
	
	public List<HistoricoTicket> findByIdTicketFK(String idTicketFK)
	{
		return repo5.findByIdTicketFK(idTicketFK);
	}
	
	
}
