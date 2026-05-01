package com.cesde.cityscooterapp.infrastructure.out.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "vehicles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehicle;
    @Column(name= "brand", nullable = false)
    private String brand;
    private String state;
    @Column(name = "serial", nullable = false)
    private String serial;
    private int capacity;


}
