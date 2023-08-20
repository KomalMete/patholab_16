package com.app.service;

import javax.validation.Valid;

import com.app.dto.LoginRequest;

public interface AdminService {

	String authenticate(LoginRequest req);

}
