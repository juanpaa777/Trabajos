package mx.utng.session26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.session26.model.dao.IGrupoDao;
import mx.utng.session26.model.entity.Grupo;


@Service
public class GrupoServiceImpl implements IGrupoService {
    @Autowired
    private IGrupoDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<Grupo> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Grupo grupo) {
        dao.save(grupo);
    }

    @Transactional(readOnly = true)
    @Override
    public Grupo getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    
}
