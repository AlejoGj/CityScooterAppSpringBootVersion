package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.application.inputport.PickUpPointService;
import com.cesde.cityscooterapp.domain.PickUpPoint;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/pickUpPoint")

public class PickUpPointController {

    private final PickUpPointService pickUpPointService;

    public PickUpPointController(PickUpPointService pickUpPointService) {
        this.pickUpPointService = pickUpPointService;
    }

    @PostMapping("/create")
    PickUpPoint createPickUpPoint(@RequestBody PickUpPoint pickUpPoint){
        return pickUpPointService.createPickUpPoint(pickUpPoint);
    }

    @GetMapping("{id}")
    PickUpPoint findPickUpPointById(@PathVariable int id){
        return pickUpPointService.getPickUpPointById(id).orElse(null);
    }

}
