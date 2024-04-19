package mx.utng.session26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.session26.model.dao.ITeacherDao;
import mx.utng.session26.model.entity.Teacher;

/*
 * Una clase service, esta basada en el patrón de diseño fachada
 * Es un único punto de acceso hacia los DAOs. Dentro de la clase
 * service , podemos operar con distintas clases DAO
 */
@Service
public class TeacherServiceImpl implements ITeacherService{

    //Inyectamos la interfaz para utilizar los métodos de CRUD
    //C-Create, R-Read Retrieve, U-Update, D-Delete
    @Autowired
    private ITeacherDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<Teacher> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Teacher teacher) {
        dao.save(teacher);
    }

    @Transactional(readOnly = true)
    @Override
    public Teacher getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
   
}
