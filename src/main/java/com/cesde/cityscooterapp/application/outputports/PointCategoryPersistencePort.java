package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.PointCategory;

import java.util.List;
import java.util.Optional;

public interface PointCategoryPersistencePort {

    PointCategory savePointCategory(PointCategory pointCategory);
    PointCategory updatePointCategory(PointCategory pointCategory);

    Optional<PointCategory> findPointCategoryById(Long id);
    List<PointCategory> findAllPointCategory();

    void deletePointCategoryById(int id);



}
