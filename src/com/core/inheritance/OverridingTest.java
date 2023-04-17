package com.core.inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		System.out.println(new Car().fuel());
		System.out.println(new Bus().fuel());
		System.out.println(new Motorcycle().fuel());
	}

}
