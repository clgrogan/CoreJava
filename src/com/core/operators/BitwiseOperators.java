package com.core.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		System.out.println("Comparison Operators");
		System.out.println("\nComparison Operators\n\t( &  |  ^ )");
		System.out.println("^ is the XOR operator. Works boolean and integer values. \n returns true if arguments are different.");
		System.out.println("\ttrue & false: " + (true & false));
		System.out.println("\ttrue & true: " + (true & true));
		System.out.println("\ttrue | false: " + (true | false));
		System.out.println("\ttrue | true: " + (true | true));
		System.out.println("\ttrue ^ false: " + (true ^ false));
		System.out.println("\ttrue ^ true: " + (true ^ true));
		System.out.println("\tfalse ^ false: " + (false ^ false));

	}

}
