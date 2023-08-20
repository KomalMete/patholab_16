package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.webjars.NotFoundException;

import com.app.dto.LoginRequest;
import com.app.entities.Admin;
import com.app.entities.Patient;
import com.app.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public String authenticate(LoginRequest req) {
		Admin admin = adminRepo.findEmailAndPassword(req.getEmail(), req.getPassword())
				.orElseThrow(()->new NotFoundException("Login Unsuccessfull") );
				return "Login Successfull....";
	}

}
