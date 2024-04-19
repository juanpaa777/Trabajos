package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

/*
 * Clase repositorio o dao, utilizaré la anotación 
 */
@Repository
public class TeacherDaoImpl implements ISteacherDao { // Cambio de StudentDaoImpl a TeacherDaoImpl

    // Entity Manager y contexto de persistencia
    // Guarda internamente todas las entidades y utiliza como caché datos de la base de datos
    @Autowired
    private EntityManager em;

    @Override
    public List<TeacherDaoImpl> list() {
        return em.createQuery("from Teacher").getResultList(); // Cambio de "from Student" a "from Teacher"
    }

    @Override
    public void save(Teacher teacher) { // Cambio de Student a Teacher
        if (teacher.getId() != null && teacher.getId() > 0) {
            // Actualizar valores del profesor
            em.merge(teacher);
        } else {
            // Crear nuevo profesor
            em.persist(teacher);
        }
    }

    @Override
    public Teacher getById(Long id) {
        return em.find(Teacher.class, id); // Cambio de Student.class a Teacher.class
    }

    @Override
    public void delete(Long id) {
        Teacher teacher = getById(id); // Cambio de Student a Teacher
        em.remove(teacher);
    }
}
