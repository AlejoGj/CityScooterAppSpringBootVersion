package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.application.inputport.PointCategoryService;
import com.cesde.cityscooterapp.domain.PointCategory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/pointCategory")

public class PointCategoryController {

    private final PointCategoryService pointCategoryService;

    public PointCategoryController(PointCategoryService pointCategoryService) {
        this.pointCategoryService = pointCategoryService;
    }

    @PostMapping("/create")
    PointCategory createPointCategory(@RequestBody PointCategory pointCategory){
        return pointCategoryService.createPointCategory(pointCategory);
    }

    @GetMapping("{id}")
    PointCategory getPointCategory(@PathVariable Long id){
        return pointCategoryService.getPointCategoryById(id).orElse(null);
    }


}
