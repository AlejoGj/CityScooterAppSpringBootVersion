package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.ScooterService;
import com.cesde.cityscooterapp.application.outputports.ScooterPersistencePort;
import com.cesde.cityscooterapp.domain.Scooter;

import java.util.Optional;

public class ScooterServiceImpl implements ScooterService {

    private final ScooterPersistencePort scooterPersistencePort;

    public ScooterServiceImpl(ScooterPersistencePort scooterPersistencePort) {
        this.scooterPersistencePort = scooterPersistencePort;
    }

    @Override
    public Scooter createScooter(Scooter scooter) {
        return scooterPersistencePort.saveScooter(scooter);
    }

    @Override
    public Scooter updateScooter(Scooter scooter) {
        return null;
    }

    @Override
    public Optional<Scooter> getScooterById(int id) {

        Scooter scooter = scooterPersistencePort.getScooterById(id).stream()
                .filter(s -> s.getIdScooter() == id)
                .findFirst()
                .orElse(null);


        return Optional.ofNullable(scooter);
    }
}
