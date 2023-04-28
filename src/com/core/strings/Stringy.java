package com.core.strings;

import java.util.Arrays;

public class Stringy { 
	String sConstructor = new String("String constructor. Overloaded a bunch of times.");
	String sLiteral = "String literal using double quotes";
//	String s3 = {1,2,3}; type mismatch, int[] can't be assigned to a String type.
	char[] chars = {'c', 'h', 'a', 'r', 'a', 'r','r','a','y'};
	String sConstructorCharArray = new String(chars);
	byte bytes[] = {65,66,67};
	String sConstructorByteArray = new String(bytes);

	public static void main(String[] args) {
		
		System.out.println("\n"
				+ "		String sConstructor = new String(\"String constructor. Overloaded a bunch of times.\");\n"
				+ "		String sLiteral = \"String literal using double quotes\";\n"
				+ "//		String s3 = {1,2,3}; type mismatch, int[] can't be assigned to a String type.\n"
				+ "		char[] chars = {'c', 'h', 'a', 'r', 'a', 'r','r','a','y'};\n"
				+ "		String sConstructorCharArray = new String(chars);\n"
				+ "		byte bytes[] = {65,66,67};\n"
				+ "		String sConstructorByteArray = new String(bytes);"
				+ "\n");
		System.out.println(new Stringy().toString());

	}

	@Override
	public String toString() {
		return "Stringy [\n\tsConstructor = " + sConstructor + "\n\tsLiteral = " + sLiteral + "\n\tchars = " + Arrays.toString(chars)
				+ "\n\tsConstructorCharArray = " + sConstructorCharArray + "\n\tbytes = " + Arrays.toString(bytes)
				+ "\n\tsConstructorByteArray = " + sConstructorByteArray + "\n]";
	}

}
