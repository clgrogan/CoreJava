package com.core.iteration;

public class OddNumbersContinue {

	public static void main(String[] args) {

		// Print the odd numbers from 1 to 100, use continue to control printing

		System.out.println("for loop executing");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println("\ti is odd: " + i);
		}

		System.out.println("\ndo-while loop executing");
		int iteration = 0;
		do {
			
			if (iteration % 2 == 0)
				continue;
			System.out.println("\ti is odd: " + iteration);

		} while (iteration++ < 100);

	}

}
