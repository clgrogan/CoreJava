package com.core.flowcontrol;

public class While {

	public static void main(String[] args) {
		int iteration = 0;
		while (true) {
			System.out.println("infinite loop");
			// infinite loop
			iteration++;
			if (iteration > 100)
				break;
		}
		iteration = 0;
		while (iteration < 5)
			System.out.println(
					"Curly brackets '{ }' are optional, \nbut just one line of code after the while will be in the loop.\n\titration #: "
							+ ++iteration);
	}

}
