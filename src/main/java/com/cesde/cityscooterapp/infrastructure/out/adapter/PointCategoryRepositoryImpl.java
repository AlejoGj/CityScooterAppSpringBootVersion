package com.cesde.cityscooterapp.infrastructure.out.adapter;


import com.cesde.cityscooterapp.application.outputports.PointCategoryPersistencePort;
import com.cesde.cityscooterapp.domain.PointCategory;
import com.cesde.cityscooterapp.infrastructure.out.mapper.PointCategoryMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.PointCategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PointCategoryRepositoryImpl implements PointCategoryPersistencePort {

    private final PointCategoryRepository pointCategoryRepository;
    private final PointCategoryMapper pointCategoryMapper;

    public PointCategoryRepositoryImpl(PointCategoryRepository pointCategoryRepository, PointCategoryMapper pointCategoryMapper) {
        this.pointCategoryRepository = pointCategoryRepository;
        this.pointCategoryMapper = pointCategoryMapper;
    }

    @Override
    public PointCategory savePointCategory(PointCategory pointCategory) {
        return null;
    }

    @Override
    public PointCategory updatePointCategory(PointCategory pointCategory) {
        return null;
    }

    @Override
    public Optional<PointCategory> findPointCategoryById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PointCategory> findAllPointCategory() {
        return List.of();
    }

    @Override
    public void deletePointCategoryById(int id) {

    }
}
