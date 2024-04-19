package mx.utng.s28.persistence;

import org.springframework.data.repository.CrudRepository;

import mx.utng.s28.model.Equipo; 

public interface EquipoRepositorio extends CrudRepository<Equipo, Long> {
Iterable<Equipo> findByNombre (String nombre);
}

