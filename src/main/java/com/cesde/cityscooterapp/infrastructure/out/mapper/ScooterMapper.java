package com.cesde.cityscooterapp.infrastructure.out.mapper;

import com.cesde.cityscooterapp.domain.Scooter;
import com.cesde.cityscooterapp.infrastructure.out.entities.ScooterEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring")
public interface ScooterMapper {

    ScooterEntity toEntity(Scooter scooter);
    Scooter toDomain(ScooterEntity entity);

    List<ScooterEntity> toDomainList(List<ScooterEntity> scooterEntities);

}
