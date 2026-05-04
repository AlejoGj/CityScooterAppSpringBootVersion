package com.cesde.cityscooterapp.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter


public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_employee", nullable = false)
    private String employeeName;
    @Column(name = "last_name_employee", nullable = false)
    private String employeeLastName;
    private String employeePhone;
    private String employeeEmail;
    private String employeePassword;
    private boolean state;


}
