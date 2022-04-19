package cl.icap.proyectofinal.m5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.proyectofinal.m5.model.Rol;
import cl.icap.proyectofinal.m5.repository.RolRepository;


@Service
@Transactional
public class RolService {

	@Autowired
	private RolRepository repo2;
	
	public List<Rol> listAll() {
		return repo2.findAll();
	}
	
	public void save(Rol rol) {
		repo2.save(rol);
	}
	
	public Rol get(String Idrol) {
		return repo2.findById(Idrol).get();
	}
	
	public void delete(String Idrol) {
		repo2.deleteById(Idrol);
	}
}