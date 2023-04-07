package com.core.flowcontrol;

public class IfElse {

	public static void main(String[] args) {
		int x = 10, y = 10;
		System.out.println("int x = 10, y = 10;");
		if (x > y) {
			System.out.println("X is greater.");
		} else if (y>x){
			System.out.println("Y is greater.");
		} else System.out.println("X and Y are equal.");
	}

}
