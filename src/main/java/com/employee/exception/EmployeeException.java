package com.employee.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class EmployeeException extends RuntimeException {
	
	public EmployeeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
