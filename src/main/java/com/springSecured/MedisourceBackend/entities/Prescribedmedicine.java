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
@Table(name="prescribedmedicine")
public class Prescribedmedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long presmed_id;

    @Column(nullable = false)
    private String dosage;

    @OneToMany
    @JoinColumn(name = "fk_medicine_id", nullable = false)
    private Medicine medicine;

    @OneToMany
    @JoinColumn(name = "fk_prescription_id", nullable = false)
    private Prescription prescription;


}
