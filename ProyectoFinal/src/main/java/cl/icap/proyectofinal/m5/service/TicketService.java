package cl.icap.proyectofinal.m5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.icap.proyectofinal.m5.model.Ticket;
import cl.icap.proyectofinal.m5.repository.TicketRepository;



@Service
@Transactional
public class TicketService {

	@Autowired
	private TicketRepository repo4;
	
	public List<Ticket> listAll() {
		return repo4.findAll();
	}
	
	public void save(Ticket ticket) {
		repo4.save(ticket);
	}
	
	public Ticket get(String Idticket) {
		return repo4.findById(Idticket).get();
	}
	
	public void delete(String Idticket) {
		repo4.deleteById(Idticket);
	}
}
