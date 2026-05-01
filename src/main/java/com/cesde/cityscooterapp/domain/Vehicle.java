package com.cesde.cityscooterapp.domain;

public class Vehicle {

    private int idVehicle, capacity;
    private String brand, state, serial;

    public Vehicle() {
    }

    public Vehicle(int idVehicle, int capacity, String brand, String state, String serial) {
        this.idVehicle = idVehicle;
        this.capacity = capacity;
        this.brand = brand;
        this.state = state;
        this.serial = serial;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "idVehicle=" + idVehicle +
                ", capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", state='" + state + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
