package mx.utng.session26.model.dao;

import java.util.List;

import mx.utng.session26.model.entity.Scholarship;

public interface IScholarshipDao {
    List<Scholarship> list();
    void save(Scholarship scholarship);
    Scholarship getById(Long id);
    void delete(Long id);
}
