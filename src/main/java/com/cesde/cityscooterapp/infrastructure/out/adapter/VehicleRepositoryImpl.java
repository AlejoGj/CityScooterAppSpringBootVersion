package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.application.outputports.VehiclePersistencePort;
import com.cesde.cityscooterapp.domain.Vehicle;
import com.cesde.cityscooterapp.infrastructure.out.mapper.VehicleMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.VehicleRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepositoryImpl implements VehiclePersistencePort {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    public VehicleRepositoryImpl(VehicleRepository vehicleRepository, VehicleMapper vehicleMapper) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleMapper = vehicleMapper;
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Optional<Vehicle> findVehicleById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Vehicle> findAllVehicles() {
        return List.of();
    }

    @Override
    public void deleteVehicleById(int id) {

    }
}
