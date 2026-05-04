package com.cesde.cityscooterapp.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "point_category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PointCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;

}
