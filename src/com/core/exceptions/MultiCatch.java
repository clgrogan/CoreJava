package com.core.exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try {

			String input = args[0];
			System.out.println("Input is: "+ input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: "+ output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Oops!!! we didn't get any args. "+ e.toString());
		} catch (NumberFormatException e){
			System.out.println("The args can't be parsed into a int number " + e.toString());
		} 
		
		System.out.println("\n... the program happily continues executing ....");
	}

}
