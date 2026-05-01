package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeePersistencePort {

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);

    Optional <Employee> findEmployeeById(int id);
    List <Employee> findAllEmployees();

    void deleteEmployeeById(int id);

}
