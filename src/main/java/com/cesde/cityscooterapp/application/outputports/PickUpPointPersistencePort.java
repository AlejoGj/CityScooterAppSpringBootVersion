package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.PickUpPoint;

import java.util.List;
import java.util.Optional;

public interface PickUpPointPersistencePort {

    PickUpPoint savePickUpPoint(PickUpPoint pickUpPoint);
    PickUpPoint updatePickUpPoint(PickUpPoint pickUpPoint);

    Optional<PickUpPoint> findPickUpPointById(int id);
    List<PickUpPoint> findAllPickUpPoints();

    void deletePickUpPointById(int id);

}
