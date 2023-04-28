package com.core.katas;

import java.util.Arrays;

public class ArrayCompareFirstCharToLast {

	public static void main(String[] args) {
		char c[] = {'a','b','c','d'};
		char chars[] = {'a','b','b','a'};

		System.out.println("\nFor array: " + Arrays.toString(c));
		System.out.println("First Element Equals Last: " + testFirstEqualsLast(c));
		System.out.println("\nFor array: " + Arrays.toString(chars));
		System.out.println("First Element Equals Last: " + testFirstEqualsLast(chars));
	}

	private static boolean testFirstEqualsLast(char[] c) {
		
		return c[0] == c[c.length-1]? true: false;
	}
	

}
