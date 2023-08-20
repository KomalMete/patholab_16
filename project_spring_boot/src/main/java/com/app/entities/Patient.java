package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="patients")
@ToString
public class Patient extends BaseEntity {
	
	
	private String firstName;
	private String lastName;
	private Gender gender;
	@Email
	private String email;
	private String password;
	private String address;
	private int phoneNo;
	 @NotBlank
	 @Past
	private LocalDate birthDate;
	
	
	
}
