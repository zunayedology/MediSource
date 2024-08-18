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
@Table(name="prescribedmed")
public class PrescribedMed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long premed_id;

    @Column(nullable = false)
    private String dosage;

    @ManyToOne
    @JoinColumn(name = "fk_medicine_id", nullable = false)
    private Medicine medicine;

    @ManyToOne
    @JoinColumn(name = "fk_prescription_id", nullable = false)
    private Prescription prescription;
}
