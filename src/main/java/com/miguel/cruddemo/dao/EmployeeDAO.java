package com.miguel.cruddemo.dao;

import com.miguel.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee e);

    void delete(int id);
}
