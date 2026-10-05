package com.raj.toxic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String FirstName;

    private String LastName;

    private String Email;

    private int Age;

    private String Address;

    private String City;

    private String State;

    private String PinCode;

    private String CompanyName;
}
