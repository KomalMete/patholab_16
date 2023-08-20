package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.PatientDto;
import com.app.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
@Autowired
private PatientService patientService;
@PostMapping
public ResponseEntity<?> addPatient(PatientDto patient){
	try {
		return new ResponseEntity<>(patientService.addPatient(patient),HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(new ApiResponse(e.getMessage()),HttpStatus.BAD_REQUEST);
		}
}
}
