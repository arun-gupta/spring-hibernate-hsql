package org.sample.spring.service;

import org.sample.spring.model.Employee;

import java.util.List;

public interface EmployeeService {
    void create(Employee employee);
    Employee get(Long id);
}
