package com.cesde.cityscooterapp.infrastructure.out.mapper;

import com.cesde.cityscooterapp.domain.Vehicle;
import com.cesde.cityscooterapp.infrastructure.out.entities.VehicleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    //@Mapping(target = "serial",source = "serial")
    Vehicle toDomain(VehicleEntity vehicleEntity);
    VehicleEntity toEntity(Vehicle vehicle);

    List<Vehicle> toDomainList(List<VehicleEntity> vehicleEntities);

}
