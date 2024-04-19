package mx.utng.s26.sesion26.model.service;

import java.util.List;

import mx.utng.s26.sesion26.model.entity.Student;

public interface IStudentsService {

    List<Student> list();
    void save (Student student);
    Student getById(Long id);
    void delete(Long id);
    
}
