package com.core.exceptions;

public class NullPointerExceptionClass {
	static Object o;
	public static void main(String[] args) {
		
		try {
			NullPointerExceptionClass.o.toString();
		} catch (NullPointerException e) {
			System.err.println("The Object \"o\" is " + o + "\n\tTNo methods of the object may be executed.");
		}

	}

}
