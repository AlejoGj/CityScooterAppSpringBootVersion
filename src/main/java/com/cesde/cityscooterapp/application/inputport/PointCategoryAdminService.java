package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.PointCategory;

import java.util.List;

public interface PointCategoryAdminService {

    void deletePointCategoryById (int id);
    List<PointCategory> getAllPointCategory();


}
