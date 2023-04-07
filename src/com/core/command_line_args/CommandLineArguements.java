package com.core.command_line_args;

public class CommandLineArguements {

	public static void main(String[] args) {
		int length = args.length;
		
		if (length == 0)
			System.out.println("No Args Provided");
		else {
			System.out.println("List of Arguments");
			for (String s : args) {
				System.out.println("\t"+ s);
			}
		}

	}

}
