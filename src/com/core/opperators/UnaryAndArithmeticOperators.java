package com.core.opperators;

public class UnaryAndArithmeticOperators {

	public static void main(String[] args) {
		System.out.println("Increment and Decrement");

		int x = 10;
		int y = ++x;
		System.out.println("int x = 10;");
		System.out.println("int y = ++x;");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		y = x++;
		System.out.println("y = x++;");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		y = x--;
		System.out.println("y = x--;");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		y = --x;
		System.out.println("y = --x;");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);

		int a = 20, b = 10;
		System.out.println("\nArithmetic Operators");
		System.out.println(" int a = 20, b = 10;");
		System.out.println(" Addition: a + b = " + (a + b));
		System.out.println(" Subtraction: a - b = " + (a - b));
		System.out.println(" Multiplication: a * b = " + (a * b));
		System.out.println(" Division: a / b = " + (a / b));
		System.out.println(" Remainder/Modulus: a % b = " + (a % b));
		System.out.println(" Remainder/Modulus: a % 3 = " + (a % 3));

	}

}
