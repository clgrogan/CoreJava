package com.core.abstraction;

public interface Manufacturer {
	
	void location();
	
	default String defaultMethod() {
		return "I have implementation of a method in an interface! defaultMethod() Inside Manufacturer.";
	}
	
	static String staticMethod() {
		return "I have implementation of a method in an interface! staticMethod() Inside Manufacturer.";
	}

}
