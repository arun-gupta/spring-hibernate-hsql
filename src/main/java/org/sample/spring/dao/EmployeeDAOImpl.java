package org.sample.spring.dao;

import org.sample.spring.model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public void update(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void delete(long id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }
}
