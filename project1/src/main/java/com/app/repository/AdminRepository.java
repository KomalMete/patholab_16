package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Admin;
import com.app.entities.Patient;

public interface AdminRepository extends JpaRepository<Admin, Long>{

	Optional<Admin> findEmailAndPassword(String email, String password);
}
