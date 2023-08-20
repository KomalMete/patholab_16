package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.PatientDto;
import com.app.entities.Patient;
import com.app.repository.PatientRepo;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo patientRepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public String addPatient(PatientDto patient) {
		Patient pat = patientRepo.save(mapper.map(patient, Patient.class));
		return pat.getFirstName()+"added";
		
	}

}
