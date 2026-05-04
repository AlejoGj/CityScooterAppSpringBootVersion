package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.PickUpPoint;

import java.util.Optional;

public interface PickUpPointService {

    PickUpPoint createPickUpPoint(PickUpPoint pickUpPoint);
    PickUpPoint updatePickUpPoint(PickUpPoint pickUpPoint);

    Optional<PickUpPoint> getPickUpPointById(int id);


}
