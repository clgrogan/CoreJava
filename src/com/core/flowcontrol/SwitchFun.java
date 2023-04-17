package com.core.flowcontrol;

public class SwitchFun {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		final int c = 20;
		switch (a) {
//		case b: // case expressions must be constant expressions
		case c:
			System.out.println("Case 20");
			break;
//		case c: duplicate case labels are NOT ALLOWED
		default:
			System.out.println("No Matches");
		}

	}

}
