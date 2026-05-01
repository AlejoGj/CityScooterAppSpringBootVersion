package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.Employee;

import java.util.List;

public interface EmployeeAdminService {

    List<Employee> getAllEmployees();
    void deleteEmployeeById(int id);

}
