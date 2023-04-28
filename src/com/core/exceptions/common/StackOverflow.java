package com.core.exceptions.common;

public class StackOverflow {
	static long loopCount;
	public static void main(String[] args) {
		method01();
	}

	private static void method01() {
		loopCount++;
		if (loopCount%10 ==0)
		System.out.println("Loop count: " + loopCount);
		method02();
	}

	private static void method02() {
		method01();
	}
}
