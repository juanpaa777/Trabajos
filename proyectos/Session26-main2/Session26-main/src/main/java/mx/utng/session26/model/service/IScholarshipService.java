package mx.utng.session26.model.service;

import java.util.List;

import mx.utng.session26.model.entity.Scholarship;

public interface IScholarshipService {
    List<Scholarship> list();
    void save(Scholarship scholarship);
    Scholarship getById(Long id);
    void delete(Long id);
}
