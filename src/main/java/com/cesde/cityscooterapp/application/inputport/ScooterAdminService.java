package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.Scooter;

import java.util.List;

public interface ScooterAdminService {


    List<Scooter> getAllScooter();

    void deleteScooterById(int id);


}
