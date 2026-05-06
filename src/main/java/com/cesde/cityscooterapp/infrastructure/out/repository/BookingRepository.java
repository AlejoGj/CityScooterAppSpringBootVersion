package com.cesde.cityscooterapp.infrastructure.out.repository;

import com.cesde.cityscooterapp.infrastructure.out.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity, Integer> {
}
