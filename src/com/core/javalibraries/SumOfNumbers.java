package com.core.javalibraries;

import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.out;
import static java.lang.Math.sqrt;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer...");
		
		Scanner sc = new Scanner(System.in);

		int number1 = Integer.parseInt(sc.next());
		System.out.println("Enter another integer...");
		int number2 = parseInt(sc.next()); // using static import.
		int result = number1 + number2;
		out.println("Sum is " + result);
		
		// Get the square root of a number using Math.sqrt(), but don't qualify the method with the
		// Math class name.
		out.println("Enter a number for which you want to get the square root...");
		double root = sqrt(sc.nextInt());
		System.out.println("Result: "+ root);

	}

}
