package com.creditcardapplication.api.exception;


public class PanNumberNotPresent extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public PanNumberNotPresent(String message) {
		super(message);
	}

	
}
