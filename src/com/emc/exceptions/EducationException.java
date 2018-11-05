package com.emc.exceptions;

import java.io.PrintStream;

import org.apache.logging.log4j.message.Message;

public class EducationException extends Exception {
	
	private String message = "";
	private EducationException() {}
	
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
