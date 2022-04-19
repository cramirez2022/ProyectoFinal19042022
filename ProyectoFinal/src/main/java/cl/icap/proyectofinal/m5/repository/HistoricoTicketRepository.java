package cl.icap.proyectofinal.m5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.icap.proyectofinal.m5.model.HistoricoTicket;
import cl.icap.proyectofinal.m5.model.Ticket;
@Repository
public interface HistoricoTicketRepository extends JpaRepository<HistoricoTicket, String> {

	List<HistoricoTicket> findByIdTicketFK(String idTicketFK);

}