package com.springSecured.MedisourceBackend.fixtures;

import com.springSecured.MedisourceBackend.entities.Hospital;
import com.springSecured.MedisourceBackend.entities.Patient;
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
@Table(name = "hospital_patient")
public class HospitalPatient {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hos_pat_id;

    @ManyToOne
    @JoinColumn(name = "fk_patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "fk_hospital_id", nullable = false)
    private Hospital hospital;

    private String secret_key;
}
