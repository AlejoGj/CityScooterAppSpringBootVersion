package com.cesde.cityscooterapp.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table (name = "booking")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBoooking;
    private LocalDateTime bookingDate;

    @Column( name = "estimated_time")
    private int estimatedTime;

    @Column(name = "estimated_price")
    private double estimatedPrice;

    @Column(name = "booking_status")
    private String bookingStatus;

    // Muchos Bookings pertenecen a UN Driver
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private DriverEntity driver;

    // Muchos Bookings pueden usar UN Scooter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scooter_id", nullable = false)
    private ScooterEntity scooter;

    // Muchos Bookings salen de UN PickUpPoint de origen
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_id", nullable = false)
    private PickUpPointEntity origin;


}
