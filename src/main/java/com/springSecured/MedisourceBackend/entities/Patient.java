package com.springSecured.MedisourceBackend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patient_id;

    @Column(nullable = false)
    private String patientName;

    @Column(nullable = false)
    private String patientBirthdate;

    @Column(nullable = false, unique = true)
    private String patientNationalid;

    @Column(nullable = false)
    private String patientAddress;

    @Column(nullable = false,unique = true)
    private String patinetPhone;

    @Column(nullable = false)
    private String patientPassword;
}
