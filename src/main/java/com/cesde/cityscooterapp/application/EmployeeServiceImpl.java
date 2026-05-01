package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.EmployeeService;
import com.cesde.cityscooterapp.application.outputports.EmployeePersistencePort;
import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.infrastructure.out.adapter.EmployeeRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeePersistencePort employeePersistencePort;

    public EmployeeServiceImpl(EmployeePersistencePort employeePersistencePort) {
        this.employeePersistencePort = employeePersistencePort;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        return employeePersistencePort.saveEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {

       Employee employee = employeePersistencePort.findEmployeeById(id).stream()
               .filter(e -> e.getId() == id)
               .findFirst()
               .orElse(null);

        return Optional.ofNullable(employee);
    }
}
