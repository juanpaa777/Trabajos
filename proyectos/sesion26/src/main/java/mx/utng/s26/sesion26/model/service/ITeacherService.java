
package mx.utng.s26.sesion26.model.service;

import java.util.List;

import mx.utng.s26.sesion26.model.dao.TeacherDaoImpl;
import mx.utng.s26.sesion26.model.entity.Student;

public interface ITeacherService {

    List<Student> list();
    void save (TeacherDaoImpl teacher);
    Student getById(Long id);
    void delete(Long id);
    
}
    

