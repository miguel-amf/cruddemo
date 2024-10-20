package com.miguel.cruddemo.service;

import com.miguel.cruddemo.dao.EmployeeRepository;
import com.miguel.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository e) {
        employeeRepository = e;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee e = null;
        if(result.isPresent()) {
            e = result.get();
        } else {
            throw new RuntimeException("Employee not found. id: " + id);
        }
        return e;
    }

    @Override
    public Employee save(Employee e) {
        return employeeRepository.save(e);
    }
    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }


}
