package com.cesde.cityscooterapp.application.inputport;


import com.cesde.cityscooterapp.domain.Vehicle;

import java.util.Optional;

public interface VehicleService {

    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Vehicle vehicle);
    Optional<Vehicle> getVehicleById(int id);

}
