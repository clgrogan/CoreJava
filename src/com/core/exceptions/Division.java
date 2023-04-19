package com.core.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers (numerator / denominator");
		

		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) { 
			System.out.print("Oops. You can't do this: \"");
			System.err.print(e.getMessage());
			System.out.println("\"");
			c = 0;
		} catch (InputMismatchException e) {
			System.err.print(e.toString() + " Cause: ");
			System.out.println("Invalid entry. Only integers (whole numbers) should be entered.");
		}
		finally {
			// Will always be executed whether or not exception occurs.
			// Good place to close resources
			sc.close();
			System.out.println("Finally: Close your resources.");
		}
		
		
		System.out.println("stuff");	}

}
