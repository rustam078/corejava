package com.fullcreative.customexception;

public class InvalidPinException extends Exception {
	

	private static final long serialVersionUID = 1L;

	public InvalidPinException(String message) {
		super(message);
	}

}