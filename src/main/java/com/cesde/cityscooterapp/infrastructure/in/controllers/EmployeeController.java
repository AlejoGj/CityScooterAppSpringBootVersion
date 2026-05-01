package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.application.inputport.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id).orElse(null);
    }

}
