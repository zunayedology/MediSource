package com.springSecured.MedisourceBackend.fixtures;

import com.springSecured.MedisourceBackend.entities.Medicine;
import com.springSecured.MedisourceBackend.entities.Prescription;
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
@Table(name = "prescription_medicine")
public class PrescriptionMedicine {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String pres_med_id;

    @ManyToOne
    @JoinColumn(name = "fk_prescription_id", nullable = false)
    private Prescription prescription;

    @ManyToOne
    @JoinColumn(name = "fk_medicine_name", nullable = false)
    private Medicine medicine;

    private String dosage;
}
