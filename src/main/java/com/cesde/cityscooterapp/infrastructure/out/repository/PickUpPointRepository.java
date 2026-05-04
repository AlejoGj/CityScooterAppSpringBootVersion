package com.cesde.cityscooterapp.infrastructure.out.repository;

import com.cesde.cityscooterapp.infrastructure.out.entities.PickUpPointEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickUpPointRepository extends JpaRepository<PickUpPointEntity, Integer> {
}
