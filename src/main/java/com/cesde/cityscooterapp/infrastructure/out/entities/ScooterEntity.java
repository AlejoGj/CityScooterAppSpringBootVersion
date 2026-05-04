package com.cesde.cityscooterapp.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table (name = "scooter")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class ScooterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int horsepower;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "pick_up_id", nullable = false)
    private PickUpPointEntity pickUp;
    private String type;



}
