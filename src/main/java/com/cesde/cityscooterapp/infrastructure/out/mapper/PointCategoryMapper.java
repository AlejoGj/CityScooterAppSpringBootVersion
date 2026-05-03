package com.cesde.cityscooterapp.infrastructure.out.mapper;

import com.cesde.cityscooterapp.domain.PointCategory;
import com.cesde.cityscooterapp.infrastructure.out.entities.PointCategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring")
public interface PointCategoryMapper {

    PointCategory toDomain(PointCategoryEntity pointCategoryEntity);
    PointCategoryEntity toEntity(PointCategory pointCategory);

    List<PointCategoryEntity> toDomainList(List<PointCategoryEntity> pointCategoryEntities);

}
