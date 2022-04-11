package com.creditcardapplication.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotEligibleForCreditCard.class)
	public ResponseEntity<ResponsesStatus> handleUserCreationException(UserNotEligibleForCreditCard details){
		ResponsesStatus response=new ResponsesStatus();
		response.setMessage(details.getLocalizedMessage());
		response.setStatusCode(400);
		return new ResponseEntity<ResponsesStatus>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ApplicationNumberNotPresent.class)
	public ResponseEntity<ResponsesStatus> handleApplicationNumberNotPresentException(ApplicationNumberNotPresent details){
		ResponsesStatus response=new ResponsesStatus();
		response.setMessage(details.getLocalizedMessage());
		response.setStatusCode(400);
		return new ResponseEntity<ResponsesStatus>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(PanNumberNotPresent.class)
	public ResponseEntity<ResponsesStatus> handlePanNotPresentException(PanNumberNotPresent details){
		ResponsesStatus responsesStatus = new ResponsesStatus();
		responsesStatus.setMessage(details.getLocalizedMessage());
		responsesStatus.setStatusCode(500);
		return new ResponseEntity<>(responsesStatus,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
