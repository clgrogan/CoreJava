package com.core.overloading;

import java.util.Iterator;

public class MainOverload {
	static int terminator = 0;

	public static void main(String[] args) {
		if (terminator > 99) return;
		terminator++;
		System.out.println("\nmain (String[] args) executed receiving args...\n");
		for (String s: args) System.err.print(" "+s);
		System.out.println(
				"\nOverloading the main method is possible, but the JVM executes the main method with the signature of \" main (String[]) \"\n\n" + "The overloading main methods can be called from the main method or from other methods.");
		main("String argument");
		int[] intArr = { 1, 2, 3, 4 };
		main(intArr);
		
		String[] strArr = {Integer.toString(terminator),"I","am","loopy. \n\n ! ! ! My stack is going to blow ! ! !\n"};
		main(strArr);

	}

	public static void main(String s) {
		System.out.println("\nmain (String s) executed and received: " + s);

	}

	public static void main(int[] ints) {
		System.out.println("\nmain (int[] ints) executed and received: ");
		for (int i : ints) {
			System.out.println("\t" + i);
		}

	}

}
