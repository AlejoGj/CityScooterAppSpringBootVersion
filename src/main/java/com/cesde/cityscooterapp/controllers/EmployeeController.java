package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
