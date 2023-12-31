package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

	@NotBlank
	@Email(message = "Invalid email pattern")
	private String email;
	
	@NotBlank
	@Length(min = 5, max = 10, message = "password too weak")
	private String password;
}
