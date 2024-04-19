package mx.utng.s26.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.s26.sesion26.model.dao.IStudentDao;
import mx.utng.s26.sesion26.model.entity.Student;

/*
 * Una clase service esta basada en el patron de diseño fachada es un unico punto de acceso hacia los dao
 * dentro de la clase servide podemos operar con distintas clases dao
 */
@Service
public class StudentServiceImpl implements IStudentsService{

    //inyectamos la interfaz para utilizar los metodos crud
    //C-Create, R-Read, U-Update, D-Delete
    @Autowired
    private IStudentDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Student> list() {
        return dao.list();
        
    }

    @Transactional
    @Override
    public void save(Student student) {
        dao.save(student);
        
    }

    @Transactional(readOnly = true)
    @Override
    public Student getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    
}
