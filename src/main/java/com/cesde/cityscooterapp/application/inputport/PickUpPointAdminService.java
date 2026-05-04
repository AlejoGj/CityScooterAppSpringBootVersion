package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.PointCategory;

import java.util.List;

public interface PickUpPointAdminService {

    List<PointCategory> getPointCategories();

    void deletePointCategoryById(int id);

}
