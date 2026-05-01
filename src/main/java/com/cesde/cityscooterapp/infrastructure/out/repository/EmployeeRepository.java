package com.cesde.cityscooterapp.infrastructure.out.repository;

import com.cesde.cityscooterapp.infrastructure.out.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
