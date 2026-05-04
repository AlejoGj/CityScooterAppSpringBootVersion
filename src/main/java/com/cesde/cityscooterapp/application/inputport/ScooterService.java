package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.Scooter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ScooterService {

    Scooter createScooter(Scooter scooter);
    Scooter updateScooter(Scooter scooter);
    Optional <Scooter> getScooterById(int id);


}
