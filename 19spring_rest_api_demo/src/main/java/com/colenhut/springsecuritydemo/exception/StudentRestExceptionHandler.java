package com.colenhut.springsecuritydemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	

	@ExceptionHandler
	public ResponseEntity<StudentErrorException> handleException(StudentNotFoundException exc){
		
		StudentErrorException exception = new StudentErrorException();
		exception.setStatus(HttpStatus.NOT_FOUND.value());
		exception.setMessage(exc.getMessage());
		exception.setTimeStamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<StudentErrorException>(exception, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorException> handleException(Exception exc){
		
		StudentErrorException body = new StudentErrorException();
		body.setStatus(HttpStatus.BAD_REQUEST.value());
		body.setMessage(exc.getMessage());
		body.setTimeStamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<StudentErrorException>(body, HttpStatus.BAD_REQUEST);
	}
	
}
