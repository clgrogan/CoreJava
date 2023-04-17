package com.core.flowcontrol;

public class SwitchProblem {

	public static void main(String[] args) {
		for (String input : args) {
			switch (input) {
			case "2":
				System.out.println("2");
				break;
			case "1":
				System.out.println("1");
				break;
			default:
				System.out.println("3");
			}
		}

	}
}