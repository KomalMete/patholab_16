package com.app.service;

import javax.validation.Valid;

import com.app.dto.LoginRequest;

public interface PatientService {

	public String authenticate(LoginRequest req);

}
