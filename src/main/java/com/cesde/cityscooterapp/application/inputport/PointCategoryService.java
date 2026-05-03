package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.PointCategory;

import java.util.Optional;

public interface PointCategoryService {

    PointCategory createPointCategory(PointCategory pointCategory);
    PointCategory updatePointCategory(PointCategory pointCategory);
    Optional<PointCategory> getPointCategoryById(Long id);


}
