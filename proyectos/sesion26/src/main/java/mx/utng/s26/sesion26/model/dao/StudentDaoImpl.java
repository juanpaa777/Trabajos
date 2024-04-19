package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Student;

/*
 * Clase repositorio o dao,utilizare la anotacion 
 */
@Repository
public class StudentDaoImpl implements IStudentDao {

    //entity manager y contexto persistencia
    //guarda internamente todas las entidades y utiliza como cache datos de db
    @Autowired
    private EntityManager em;
    @Override
    public List<Student> list() {
        return em.createQuery("from Student").getResultList();
        
       
    }

    @Override
    public void save(Student student) {
        if(student.getId()!=null&& student.getId()>0){
            //actualizar valores estudiante
            em.merge(student);
        }else {
            //creamos nuevo estudiante
            em.persist(student);
        }
    }

    @Override
    public Student getById(Long id) {
        return em.find(Student.class, id);
        
    }

    @Override
    public void delete(Long id) {
        //
        Student student =getById(id);
        em.remove(student);
    }
    
}
