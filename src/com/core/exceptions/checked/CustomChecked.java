package com.core.exceptions.checked;

public class CustomChecked extends Exception {
	public CustomChecked(String message) {
		super(message);
		
	}

	public CustomChecked(String validCar, String car) {
		super("\n\n\t"+validCar +" parking only!\n\tNo POS "+car+" allowed.\n");
	}
}
