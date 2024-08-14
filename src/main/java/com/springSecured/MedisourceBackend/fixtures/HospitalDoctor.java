package com.springSecured.MedisourceBackend.fixtures;

import com.springSecured.MedisourceBackend.entities.Doctor;
import com.springSecured.MedisourceBackend.entities.Hospital;
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
@Table(name = "hospital_doctor")
public class HospitalDoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hos_doc_id;

    @ManyToOne
    @JoinColumn(name = "fk_doctor_id", nullable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "fk_hospital_id", nullable = false)
    private Hospital hospital;

    private String secret_key;
}
