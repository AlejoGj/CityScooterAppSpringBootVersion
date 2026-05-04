package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.PickUpPointService;
import com.cesde.cityscooterapp.application.outputports.PickUpPointPersistencePort;
import com.cesde.cityscooterapp.domain.PickUpPoint;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PickUpPointServiceImpl implements PickUpPointService {

    private final PickUpPointPersistencePort pickUpPointPersistencePort;

    public PickUpPointServiceImpl(PickUpPointPersistencePort pickUpPointPersistencePort) {
        this.pickUpPointPersistencePort = pickUpPointPersistencePort;
    }

    @Override
    public PickUpPoint createPickUpPoint(PickUpPoint pickUpPoint) {
        return pickUpPointPersistencePort.savePickUpPoint(pickUpPoint);
    }

    @Override
    public PickUpPoint updatePickUpPoint(PickUpPoint pickUpPoint) {
        return null;
    }

    @Override
    public Optional<PickUpPoint> getPickUpPointById(int id) {

        PickUpPoint pickUpPoint = pickUpPointPersistencePort.findPickUpPointById(id).stream()
                .filter(p -> p.getIdPoint() == id)
                .findFirst()
                .orElse(null);

        return Optional.ofNullable(pickUpPoint);
    }
}
