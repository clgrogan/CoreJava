package com.core.exceptions;

public class StringParser {
	static int i1,i2;

	public static void main(String[] args) {
		String s = "abcd";
		try {
			i1 = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.err.println("The value \""+s+"\" cannot be parsed into an int.");
		}
		
		

	}

}
