package mx.utng.session26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.session26.model.entity.Scholarship;

@Repository
public class ScholarshipDaoImpl implements IScholarshipDao {

    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Scholarship> list() {
        return em.createQuery("from Scholarship").getResultList();
    }

    @Override
    public void save(Scholarship scholarship) {
        if (scholarship.getId() != null && scholarship.getId() > 0) {
            em.merge(scholarship);
        } else {
            em.persist(scholarship);
        }
    }

    @Override
    public Scholarship getById(Long id) {
        return em.find(Scholarship.class, id);
    }

    @Override
    public void delete(Long id) {
        Scholarship scholarship = getById(id);
        em.remove(scholarship);
    }

}
