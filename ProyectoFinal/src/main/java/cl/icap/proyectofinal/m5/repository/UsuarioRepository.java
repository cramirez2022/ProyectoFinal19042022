package cl.icap.proyectofinal.m5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.icap.proyectofinal.m5.model.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	
Usuario findByNombreusuario(String nombreusuario);

}