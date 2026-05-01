package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.application.outputports.EmployeePersistencePort;
import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.infrastructure.out.mapper.UserMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepositoryImpl implements EmployeePersistencePort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public EmployeeRepositoryImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> findEmployeeById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return List.of();
    }

    @Override
    public void deleteEmployeeById(int id) {

    }
}
