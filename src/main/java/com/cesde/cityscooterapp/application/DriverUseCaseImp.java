package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.DriverUseCase;
import com.cesde.cityscooterapp.application.outputports.DriverPersistencePort;
import com.cesde.cityscooterapp.domain.Driver;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DriverUseCaseImp implements DriverUseCase {


    private final DriverPersistencePort driverPersistencePort;

    public DriverUseCaseImp(DriverPersistencePort driverPersistencePort) {
        this.driverPersistencePort = driverPersistencePort;
    }

    @Override
    public Driver createrDriver(Driver driver) {

        return driverPersistencePort.saveDriver(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
    }

    @Override
    public Optional<Driver> getDriverById(int id /* este es el id que envio*/) {

        // Stream = itere drivers (posible reemplazo del for para recorrer la lista)
        Driver driver = driverPersistencePort.findDriverById(id).stream()
                // busqueme donde encuentre el id que le mando
                .filter(d -> d.getId() == id)
                .findFirst()// lo que encuentre primero
                .orElse(null); // sino nulo

        return Optional.ofNullable(driver);
    }
}
