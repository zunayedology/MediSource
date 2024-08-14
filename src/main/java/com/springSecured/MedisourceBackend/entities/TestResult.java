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
@Table(name="testResult")
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testres_id;

    @ManyToOne
    @JoinColumn(name = "fk_test_id")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "fk_prescription_id")
    private Prescription prescription;

    @ManyToOne
    @JoinColumn(name = "fk_hospital_id")
    private Hospital hospital;

}
