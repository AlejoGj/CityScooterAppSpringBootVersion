package com.cesde.cityscooterapp.infrastructure.out.mapper;

import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.infrastructure.out.entities.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeMapper {

    Employee toDomain (EmployeeEntity employeeEntity);
    EmployeeEntity toEntity( Employee employee);

    List <EmployeeEntity> toDomainList(List <EmployeeEntity> employeeEntities);

}
