package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import mx.utng.s26.sesion26.model.entity.Student;

public interface IStudentDao {
List<Student> list();
void save(Student student);
Student getById(Long id);
void delete(Long id);
}
