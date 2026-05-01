package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.Vehicle;

import java.util.List;

public interface VehicleAdminService {

    List<Vehicle> getAllVehicles();
    void deleteVehicleById(int id);

}
