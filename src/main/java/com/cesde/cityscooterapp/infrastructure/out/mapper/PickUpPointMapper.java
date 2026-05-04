package com.cesde.cityscooterapp.infrastructure.out.mapper;

import com.cesde.cityscooterapp.domain.PickUpPoint;
import com.cesde.cityscooterapp.infrastructure.out.entities.PickUpPointEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PickUpPointMapper {

    PickUpPoint toDomain(PickUpPointEntity pickUpPointEntity);
    PickUpPointEntity toEntity(PickUpPoint pickUpPoint);

    List<PickUpPoint> toDomainList(List<PickUpPointEntity> pickUpPointEntities);



}
