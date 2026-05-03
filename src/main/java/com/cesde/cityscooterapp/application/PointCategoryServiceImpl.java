package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inputport.PointCategoryService;
import com.cesde.cityscooterapp.application.outputports.PointCategoryPersistencePort;
import com.cesde.cityscooterapp.domain.PointCategory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PointCategoryServiceImpl implements PointCategoryService {

    private final PointCategoryPersistencePort pointCategoryPersistencePort;


    public PointCategoryServiceImpl(PointCategoryPersistencePort pointCategoryPersistencePort) {
        this.pointCategoryPersistencePort = pointCategoryPersistencePort;
    }

    @Override
    public PointCategory createPointCategory(PointCategory pointCategory) {
        return pointCategoryPersistencePort.savePointCategory(pointCategory);
    }

    @Override
    public PointCategory updatePointCategory(PointCategory pointCategory) {
        return null;
    }

    @Override
    public Optional<PointCategory> getPointCategoryById(Long id) {

            PointCategory pointCategory = pointCategoryPersistencePort.findPointCategoryById(id).stream()
                    .filter(p -> p.getIdCategory() == id)
                    .findFirst()
                    .orElse(null);


        return Optional.ofNullable(pointCategory);
    }
}
