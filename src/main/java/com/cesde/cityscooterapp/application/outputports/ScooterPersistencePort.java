package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.Scooter;

import java.util.List;
import java.util.Optional;

public interface ScooterPersistencePort {

    Scooter saveScooter(Scooter scooter);
    Scooter updateScooter(Scooter scooter);

    Optional<Scooter> getScooterById(int id);
    List<Scooter> getAllScooters();

    void deleteScooterById(int id);

}
