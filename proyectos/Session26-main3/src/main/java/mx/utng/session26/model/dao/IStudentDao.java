package mx.utng.session26.model.dao;

import java.util.List;

import mx.utng.session26.model.entity.Student;

public interface IStudentDao {
    List<Student> list();
    void save(Student student);
    Student getById(Long id);
    void delete(Long id);
}
