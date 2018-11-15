package com.emc.exceptions;

import java.io.PrintStream;

public class EducationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2672743502424875197L;
	private String message = "";
		
	public EducationException(String message) {
		super(message);
		this.message = message;
	}
	
	
	public String getMessage() {
		return message;
	}

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}
}
