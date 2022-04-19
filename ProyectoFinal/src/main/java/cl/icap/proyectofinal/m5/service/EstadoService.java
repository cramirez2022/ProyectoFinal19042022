package cl.icap.proyectofinal.m5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.proyectofinal.m5.model.Estado;
import cl.icap.proyectofinal.m5.repository.EstadoRepository;

@Service
@Transactional
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> listAll() {
		return repo.findAll();
	}
	
	public void save(Estado estados) {
		repo.save(estados);
	}
	
	public Estado get(String idestado) {
		return repo.findById(idestado).get();
	}
	
	public void delete(String idestado) {
		repo.deleteById(idestado);
	}
}