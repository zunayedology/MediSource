package com.springSecured.MedisourceBackend.repository;

import com.springSecured.MedisourceBackend.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
