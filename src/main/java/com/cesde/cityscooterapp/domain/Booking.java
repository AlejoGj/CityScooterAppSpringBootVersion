package com.cesde.cityscooterapp.domain;

import java.time.LocalDate;

public class Booking {

    private int idBooking;
    private LocalDate date;
    private Scooter scooter;
    private Driver driver;
    private PickUpPoint origen;
    private String arrive;
    private double stimatedPrice;
    private int stimatedTime;
    private double bookingStatus;

    public Booking() {
    }

    public Booking(int idBooking, LocalDate date, Scooter scooter, Driver driver, PickUpPoint origen, String arrive, double stimatedPrice, int stimatedTime, double bookingStatus) {
        this.idBooking = idBooking;
        this.date = date;
        this.scooter = scooter;
        this.driver = driver;
        this.origen = origen;
        this.arrive = arrive;
        this.stimatedPrice = stimatedPrice;
        this.stimatedTime = stimatedTime;
        this.bookingStatus = bookingStatus;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public PickUpPoint getOrigen() {
        return origen;
    }

    public void setOrigen(PickUpPoint origen) {
        this.origen = origen;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public double getStimatedPrice() {
        return stimatedPrice;
    }

    public void setStimatedPrice(double stimatedPrice) {
        this.stimatedPrice = stimatedPrice;
    }

    public int getStimatedTime() {
        return stimatedTime;
    }

    public void setStimatedTime(int stimatedTime) {
        this.stimatedTime = stimatedTime;
    }

    public double getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(double bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
