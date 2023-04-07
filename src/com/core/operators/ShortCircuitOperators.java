package com.core.operators;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		System.out.println("Short Circuit Operators");
		System.out
				.println(" Improve the performance of the application by " + "\n never evaluating the second argument "
						+ "\n if the first argument satisfies the condition by itself.");
		System.out.println("\t&&\t||");
		boolean a = true, b = false;
		System.out.println("boolean a = true, b = false; ");
		System.out.println("a && a: " + (a && a));
		System.out.println("a && b: " + (a && b));
		System.out.println("a || a: " + (a || a));
		System.out.println("a || b: " + (a || b));

	}

}
