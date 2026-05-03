package com.cesde.cityscooterapp.domain;

public class PointCategory {
    private int idCategory;
    private String description;

    public PointCategory() {
    }

    public PointCategory(int idCategory, String description) {
        this.idCategory = idCategory;
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
