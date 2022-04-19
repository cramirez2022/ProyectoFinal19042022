package cl.icap.proyectofinal.m5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.proyectofinal.m5.model.Usuario;
import cl.icap.proyectofinal.m5.repository.UsuarioRepository;


@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo3;
	
	public List<Usuario> listAll() {
		return repo3.findAll();
	}
	
	public void save(Usuario usuarios) {
		repo3.save(usuarios);
	}
	
	public Usuario get(String IdUsuario) {
		return repo3.findById(IdUsuario).get();
	}
	
	public void delete(String IdUsuario) {
		repo3.deleteById(IdUsuario);
	}
}
