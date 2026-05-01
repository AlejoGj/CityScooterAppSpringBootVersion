package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.VehicleService;
import com.cesde.cityscooterapp.application.outputports.VehiclePersistencePort;
import com.cesde.cityscooterapp.domain.Vehicle;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehiclePersistencePort vehiclePersistencePort;

    public VehicleServiceImpl(VehiclePersistencePort vehiclePersistencePort) {
        this.vehiclePersistencePort = vehiclePersistencePort;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehiclePersistencePort.saveVehicle(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Optional<Vehicle> getVehicleById(int id) {

        Vehicle vehicle = vehiclePersistencePort.findVehicleById(id).stream()
                .filter(v -> v.getIdVehicle() == id)
                .findFirst()
                .orElse(null);


        return Optional.ofNullable(vehicle);
    }
}
