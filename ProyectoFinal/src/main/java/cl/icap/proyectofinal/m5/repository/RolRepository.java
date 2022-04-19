package cl.icap.proyectofinal.m5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.icap.proyectofinal.m5.model.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol, String> {

}