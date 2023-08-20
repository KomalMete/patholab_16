package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name="Employee")
@Setter
@Getter
@ToString(exclude = "password")
public class Employee extends BaseEntity{

	@Column(length =30)
	private String firstName;
	
	@Column(length =30)
    private String lastName;
	
	@Column(length =30, unique= true)
    private String email;
	
	@Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Column(nullable = false)
    private String password; 
    
    @Column(length = 100)
    private String address;
    
    
    private int phoneNo;
    
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private LocalDate birthDate;
}
