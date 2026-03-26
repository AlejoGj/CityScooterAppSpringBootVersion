package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return Optional.empty();
    }
}
