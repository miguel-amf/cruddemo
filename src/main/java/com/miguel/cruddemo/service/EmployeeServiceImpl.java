package com.miguel.cruddemo.service;

import com.miguel.cruddemo.dao.EmployeeDAO;
import com.miguel.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO e) {
        employeeDAO = e;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }


}
