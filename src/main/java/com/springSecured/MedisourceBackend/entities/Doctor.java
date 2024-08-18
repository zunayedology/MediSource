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
@Table(name="doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctor_id;  // Renamed from doctor_id to doctorId

    @Column(nullable = false)
    private String doctorName;  // Renamed from name to doctorName

    @Column(nullable = false, unique = true)
    private String doctorLicense;  // Renamed from License to doctorLicense

    @Column(nullable = false)
    private String doctorSpecialty;  // Renamed from specialty to doctorSpecialty

    @Column(nullable = false, unique = true)
    private String doctorEmail;  // Renamed from email to doctorEmail

    @Column(nullable = false,unique = true)
    private String doctorPhone;  // Renamed from phone to doctorPhone

    @Column(nullable = false)
    private String doctorPassword;  // Renamed from password to doctorPassword


    private boolean verified = false;   // Unverified by default

}
