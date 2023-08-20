package com.app.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
	private String message;
	private LocalDateTime timeStamp;
	
	public ApiResponse(String mesg) {
		this.message=mesg;
		this.timeStamp=LocalDateTime.now();
	}
}
