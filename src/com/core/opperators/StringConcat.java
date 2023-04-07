package com.core.opperators;

public class StringConcat {

	public static void main(String[] args) {
		System.out.println("\nThe '+' operator is overridden and can be used to concatenate Strings.");

		String s1 = "xyz";
		String s2 = "abc";
		int a = 10, b = 20, c = 30;

		System.out.println(" String s1 = \"xyz\";\n" + " String s2 = \"abc\";");
		System.out.println(" int a = 10, b = 20, c = 30;");
		System.out.println(" s1 + s2 = " + s1 + s2);
		System.out.println(" a + b + c = " + a + b + c);
		System.out.println(" s1 + a + b + c = " + s1 + a + b + c);
		System.out.println(" a + b + s1 + a + b = " + (a + b + s1+ a + b));

	}

}
