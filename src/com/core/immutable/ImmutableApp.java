package com.core.immutable;

public class ImmutableApp {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("\nImmutability Demo Using String and Custom\n");
		System.out.println("	String s1= \"Hello\";\n" + "	String s2 = \"World\";");
		System.out.println("");

		System.out.println("Initial value & memoryAddress s1.concat(s2):\n\ts1: " + s1 + "   memLocation: "
				+ s1.hashCode() + "\n\ts2: " + s2 + "   memLocation: " + s2.hashCode());
		System.out.println("s1.concat(s2); returns: " + s1.concat(s2));
		System.out.println("Post concat value & memoryAddress s1.concat(s2):\n\ts1: " + s1 + "   memLocation: "
				+ s1.hashCode() + "\n\ts2: " + s2 + "   memLocation: " + s2.hashCode());
		System.out.println("\ns1 = s1.concat(s2);");
		s1 = s1.concat(s2);
		System.out.println("Post concat value & memoryAddress s1.concat(s2):\n\ts1: " + s1 + "   memLocation: "
				+ s1.hashCode() + "\n\ts2: " + s2 + "   memLocation: " + s2.hashCode());
	}
}
