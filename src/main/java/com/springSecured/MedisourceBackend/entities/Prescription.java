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
@Table(name="prescription")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescription_id;

    @Column(nullable = false,unique = true)
    private String prescriptionCode;

    @Column(nullable = false)
    private String prescribedDate;

    @Column(nullable = false)
    private String remarks;

    @OneToMany
    @JoinColumn(name = "fk_hospital_id", nullable = false)
    private Hospital hospital;

    @OneToMany
    @JoinColumn(name = "fk_patient_id",nullable = false)
    private  Patient patient;

    @OneToMany
    @JoinColumn(name = "fk_doctor_id",nullable = false)
    private  Doctor doctor;







}
