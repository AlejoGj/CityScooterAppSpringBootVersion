package com.cesde.cityscooterapp.domain;

public class PickUpPoint {

    private int idPoint;
    private String pointName, address, status;
    private PointCategory category;
    private Employee admin;

    public PickUpPoint() {
    }

    public PickUpPoint(int idPoint, String pointName, String address, String status, PointCategory category, Employee admin) {
        this.idPoint = idPoint;
        this.pointName = pointName;
        this.address = address;
        this.status = status;
        this.category = category;
        this.admin = admin;
    }

    public int getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(int idPoint) {
        this.idPoint = idPoint;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PointCategory getCategory() {
        return category;
    }

    public void setCategory(PointCategory category) {
        this.category = category;
    }

    public Employee getAdmin() {
        return admin;
    }

    public void setAdmin(Employee admin) {
        this.admin = admin;
    }
}
