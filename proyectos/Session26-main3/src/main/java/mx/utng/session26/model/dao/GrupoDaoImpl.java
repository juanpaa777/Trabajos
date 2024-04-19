package mx.utng.session26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.session26.model.entity.Grupo;


@Repository
public class GrupoDaoImpl implements IGrupoDao {
        @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Grupo> list() {
        return em.createQuery("from Grupo").getResultList();
    }

    @Override
    public void save(Grupo grupo) {
        System.out.println("Grupo id="+grupo.getId());
        if(grupo.getId() != null && grupo.getId() >0){
            //Actualizo estudiante
            em.merge(grupo);
        }else{
            //Creamos nuevo estudiante en la base
            em.persist(grupo);
        }
    }

    @Override
    public Grupo getById(Long id) {
        return em.find(Grupo.class, id);
    }

    @Override
    public void delete(Long id) {
        Grupo grupo = getById(id);
        em.remove(grupo);
    }

    
}
    

