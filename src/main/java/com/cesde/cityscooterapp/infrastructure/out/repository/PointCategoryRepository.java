package com.cesde.cityscooterapp.infrastructure.out.repository;


import com.cesde.cityscooterapp.infrastructure.out.entities.PointCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointCategoryRepository extends JpaRepository<PointCategoryEntity, Integer> {
}
