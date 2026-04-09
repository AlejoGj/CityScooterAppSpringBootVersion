package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.EmployeeService;
import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.infrastructure.out.adapter.EmployeeRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl employeeRepositoryImpl;

    EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepositoryImpl) {
        this.employeeRepositoryImpl = employeeRepositoryImpl;
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
