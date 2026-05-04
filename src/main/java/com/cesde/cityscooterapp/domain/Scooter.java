package com.cesde.cityscooterapp.domain;

public class Scooter extends Vehicle {

    private int idScooter;
    private int horsepower;
    private PickUpPoint pickUpPoint;
    private String type;

    public Scooter() {
    }

    public Scooter(int idVehicle, int capacity, String brand, String state, String serial, int idScooter, int horsepower, PickUpPoint pickUpPoint, String type) {
        super(idVehicle, capacity, brand, state, serial);
        this.idScooter = idScooter;
        this.horsepower = horsepower;
        this.pickUpPoint = pickUpPoint;
        this.type = type;
    }

    public int getIdScooter() {
        return idScooter;
    }

    public void setIdScooter(int idScooter) {
        this.idScooter = idScooter;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public PickUpPoint getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(PickUpPoint pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
