package com.miguel.cruddemo.dao;

import com.miguel.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
