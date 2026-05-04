package com.cesde.cityscooterapp.infrastructure.out.repository;

import com.cesde.cityscooterapp.infrastructure.out.entities.ScooterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScooterRepository extends JpaRepository<ScooterEntity, Integer> {
}
