package mx.utng.session26.model.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.session26.model.entity.Teacher;


@Repository
public class TeacherDaoImpl implements ITeacherDao{
     //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Teacher> list() {
        return em.createQuery("from Teacher").getResultList();
    }

    @Override
    public void save(Teacher teacher) {
        if(teacher.getId() != null && teacher.getId() >0){
            em.merge(teacher);
        }else{
            em.persist(teacher);
        }
    }

    @Override
    public Teacher getById(Long id) {
        return em.find(Teacher.class, id);
    }

    @Override
    public void delete(Long id) {
        Teacher teacher = getById(id);
        em.remove(teacher);
    }

    
}
