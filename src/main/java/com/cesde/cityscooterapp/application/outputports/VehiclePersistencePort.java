package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehiclePersistencePort {

    Vehicle saveVehicle (Vehicle vehicle);
    Vehicle updateVehicle(Vehicle vehicle);

    Optional <Vehicle> findVehicleById(int id);
    List <Vehicle> findAllVehicles();

    void deleteVehicleById (int id);

}
