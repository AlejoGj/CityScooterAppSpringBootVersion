package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.application.inputport.VehicleService;
import com.cesde.cityscooterapp.domain.Vehicle;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicle")

public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController (VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @PostMapping("/create")
    Vehicle createVehicle (@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @GetMapping("/{id}")
    Vehicle getVehicleById (@PathVariable int id){
        return  vehicleService.getVehicleById(id).orElse(null);
    }

}
