package com.example.pms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example.pms.exception.ExceptionMessageDetail;

@ControllerAdvice
@CrossOrigin(origins = "http://localhost:4200")
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> general(Exception exception, WebRequest request) {
		
		return new ResponseEntity<>(new ExceptionMessageDetail("NO USER FOUND!"), HttpStatus.NOT_FOUND);
		
	}
	
}