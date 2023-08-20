package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employee;
import com.app.entities.Patient;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findEmailAndPassword(String email, String password);
}
