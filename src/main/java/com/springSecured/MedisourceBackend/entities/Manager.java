package com.springSecured.MedisourceBackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long manager_id;

    @Column(nullable = false)
    private String managerName;

    @Column(nullable = false, unique = true)
    private String managerEmail;

    @Column(nullable = true)
    private String managerPhone;

    @Column(nullable = false)
    private String managerPassword;

    @ManyToOne
    @JoinColumn(name = "fk_hospital_id", nullable = false)
    private Hospital hospital;

    private boolean verified = false;
}