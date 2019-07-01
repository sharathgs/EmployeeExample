package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.employee.dto.ResponseDto;

@ControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<ResponseDto> handleException(Exception e)
	{
		return new ResponseEntity<ResponseDto>(new ResponseDto(e.getMessage()),HttpStatus.CREATED);
	}

}
