package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import com.app.entities.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatientDto {
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String password;
	private String address;
	private int phoneNo;
	private LocalDate birthDate;
}
