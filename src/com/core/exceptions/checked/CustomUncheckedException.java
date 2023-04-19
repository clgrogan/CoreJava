package com.core.exceptions.checked;

public class CustomUncheckedException extends RuntimeException {
	
	public CustomUncheckedException() {
		super("Business Exception occured. Value not allowed");
	}
}
