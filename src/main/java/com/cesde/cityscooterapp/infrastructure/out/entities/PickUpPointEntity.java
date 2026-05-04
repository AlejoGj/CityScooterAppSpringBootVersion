package com.cesde.cityscooterapp.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "pick_up_point")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PickUpPointEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pointName, address, status;


    //  Relación ManyToOne: Muchos PickUpPoint pueden tener UNA categoría
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)  // Columna de FK
    private PointCategoryEntity category;

    //  Relación ManyToOne: Muchos PickUpPoint pueden tener UN admin (Employee)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)  // Columna de FK
    private EmployeeEntity admin;



}
