package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.application.outputports.ScooterPersistencePort;
import com.cesde.cityscooterapp.domain.Scooter;
import com.cesde.cityscooterapp.infrastructure.out.mapper.ScooterMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.ScooterRepository;

import java.util.List;
import java.util.Optional;

public class ScooterRepositoryImpl implements ScooterPersistencePort {

    private ScooterRepository scooterRepository;
    private ScooterMapper scooterMapper;

    public ScooterRepositoryImpl(ScooterRepository scooterRepository, ScooterMapper scooterMapper) {
        this.scooterRepository = scooterRepository;
        this.scooterMapper = scooterMapper;
    }

    @Override
    public Scooter saveScooter(Scooter scooter) {
        return null;
    }

    @Override
    public Scooter updateScooter(Scooter scooter) {
        return null;
    }

    @Override
    public Optional<Scooter> getScooterById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Scooter> getAllScooters() {
        return List.of();
    }

    @Override
    public void deleteScooterById(int id) {

    }
}
