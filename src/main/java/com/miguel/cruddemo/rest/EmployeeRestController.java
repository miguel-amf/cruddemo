package com.miguel.cruddemo.rest;

import com.miguel.cruddemo.dao.EmployeeDAO;
import com.miguel.cruddemo.dao.EmployeeDAOJpaImpl;
import com.miguel.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO e) {
        employeeDAO = e;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
