package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.webjars.NotFoundException;

import com.app.dto.LoginRequest;
import com.app.entities.Patient;
import com.app.repository.PatientRepository;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String authenticate(LoginRequest req) {
		
		Patient pat = patientRepo.findEmailAndPassword(req.getEmail(), req.getPassword())
		.orElseThrow(()->new NotFoundException("Login Unsuccessfull") );
		return "Login Successfull....";
		//return modelMapper.map(pat, LoginResponse.class);
	}

	
}
