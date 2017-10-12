package org.sample.spring.dao;

import org.sample.spring.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void create(Employee employee);

    void update(Employee employee);

    Employee getEmployeeById(long id);

    void delete(long id);
}
