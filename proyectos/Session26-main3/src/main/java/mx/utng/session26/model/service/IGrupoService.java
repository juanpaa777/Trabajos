package mx.utng.session26.model.service;

import java.util.List;

import mx.utng.session26.model.entity.Grupo;

public interface IGrupoService {
    List<Grupo> list();
    void save(Grupo grupo);
    Grupo getById(Long id);
    void delete(Long id);
}
