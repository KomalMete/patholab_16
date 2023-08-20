package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.webjars.NotFoundException;

import com.app.dto.LoginRequest;
import com.app.entities.Employee;
import com.app.entities.Patient;
import com.app.repository.EmployeeRepository;
import com.app.repository.PatientRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public String authenticate(LoginRequest req) {
		
		Employee emp = empRepo.findEmailAndPassword(req.getEmail(), req.getPassword())
				.orElseThrow(()->new NotFoundException("Login Unsuccessfull") );
				return "Login Successfull....";
	}

}
