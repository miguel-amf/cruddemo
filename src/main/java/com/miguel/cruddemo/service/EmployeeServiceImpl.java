package com.miguel.cruddemo.service;

import com.miguel.cruddemo.dao.EmployeeDAO;
import com.miguel.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO e) {
        employeeDAO = e;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee e) {
        return employeeDAO.save(e);
    }
    @Override
    @Transactional
    public void delete(int id) {
        employeeDAO.delete(id);
    }


}
