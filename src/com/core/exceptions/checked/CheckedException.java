package com.core.exceptions.checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedException {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		// FileInputStream throws a FileNotFound exception
		
		// Handled by having the containing method throw the exception.
		FileInputStream fisA = new FileInputStream("");
		
		// Handled by surrounding with try-catch.
		try {
		FileInputStream fis = new FileInputStream("");
		}
		catch (FileNotFoundException e) {
			
		}
	}
}
