package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.repositories.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DriverServiceImp implements DriverService {


    private final DriverRepository driverRepository;

    DriverServiceImp(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }


    @Override
    public Driver createrDriver(Driver driver) {

        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
    }

    @Override
    public Optional<Driver> getDriverById(int id /* este es el id que envio*/) {

        // Stream = itere drivers (posible reemplazo del for para recorrer la lista)
        Driver driver = driverRepository.drivers.stream()
                // busqueme donde encuentre el id que le mando
                .filter(d -> d.getId() == id)
                .findFirst()// lo que encuentre primero
                .orElse(null); // sino nulo

        return Optional.ofNullable(driver);
    }
}
