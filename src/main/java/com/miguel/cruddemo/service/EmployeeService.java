package com.miguel.cruddemo.service;

import com.miguel.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    public Employee findById(int id);

    public Employee save(Employee e);

    public void delete(int id);
}
