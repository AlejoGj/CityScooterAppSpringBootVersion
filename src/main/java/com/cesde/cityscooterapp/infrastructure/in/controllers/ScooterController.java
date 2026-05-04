package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.application.inputport.ScooterService;
import com.cesde.cityscooterapp.domain.Scooter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/scooter")

public class ScooterController {

    private final ScooterService scooterService;

    public ScooterController(ScooterService scooterService) {
        this.scooterService = scooterService;
    }

    @PostMapping("/create")
    Scooter createScooter(@RequestBody Scooter scooter) {
        return scooterService.createScooter(scooter);
    }

    @GetMapping ("{id}")
    Scooter getScooterById(@PathVariable int id){
        return scooterService.getScooterById(id).orElse(null);
    }


}
