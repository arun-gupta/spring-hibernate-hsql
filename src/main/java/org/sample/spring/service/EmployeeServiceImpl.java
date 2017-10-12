package org.sample.spring.service;

import org.sample.spring.dao.EmployeeDAO;
import org.sample.spring.model.Employee;
import org.sample.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void create(Employee employee) {
        employeeDAO.create(employee);
    }

    @Override
    public Employee get(Long id) {
        return employeeDAO.getEmployeeById(id);
    }
}

