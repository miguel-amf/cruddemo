package com.miguel.cruddemo.rest;

import com.miguel.cruddemo.entity.Employee;
import com.miguel.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService e) {
        employeeService = e;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee e = employeeService.findById(employeeId);
        if (e == null) {
            throw new RuntimeException("Employee id not found: " + employeeId);
        }
        return e;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        //set id to zero in case non-zero value is given
        theEmployee.setId(0);

        return employeeService.save(theEmployee);

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        return employeeService.save(theEmployee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
        employeeService.delete(employeeId);
    }

}
