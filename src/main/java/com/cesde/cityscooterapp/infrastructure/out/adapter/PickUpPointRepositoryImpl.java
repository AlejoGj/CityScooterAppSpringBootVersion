package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.application.outputports.PickUpPointPersistencePort;
import com.cesde.cityscooterapp.domain.PickUpPoint;
import com.cesde.cityscooterapp.infrastructure.out.mapper.PickUpPointMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.PickUpPointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PickUpPointRepositoryImpl implements PickUpPointPersistencePort {

    private final PickUpPointMapper pickUpPointMapper;
    private final PickUpPointRepository pickUpPointRepository;

    public PickUpPointRepositoryImpl(PickUpPointMapper pickUpPointMapper, PickUpPointRepository pickUpPointRepository) {
        this.pickUpPointMapper = pickUpPointMapper;
        this.pickUpPointRepository = pickUpPointRepository;
    }

    @Override
    public PickUpPoint savePickUpPoint(PickUpPoint pickUpPoint) {
        return null;
    }

    @Override
    public PickUpPoint updatePickUpPoint(PickUpPoint pickUpPoint) {
        return null;
    }

    @Override
    public Optional<PickUpPoint> findPickUpPointById(int id) {
        return Optional.empty();
    }

    @Override
    public List<PickUpPoint> findAllPickUpPoints() {
        return List.of();
    }

    @Override
    public void deletePickUpPointById(int id) {

    }
}
