package mx.utng.session26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.session26.model.dao.IScholarshipDao;
import mx.utng.session26.model.entity.Scholarship;

@Service
public class ScholarshipServiceImpl implements IScholarshipService {

    @Autowired
    private IScholarshipDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Scholarship> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Scholarship scholarship) {
        dao.save(scholarship);
    }

    @Transactional(readOnly = true)
    @Override
    public Scholarship getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
