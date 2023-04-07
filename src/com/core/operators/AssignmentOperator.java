package com.core.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 100;
		int x, y, z;
		x = y = z = 200;
		int b = 20;
		b += 40;
		System.out.println("Assignment:\n int a = 100;\n\t a = " + a + "\nint x, y, z;\n" + "Chained Assignment: \n x = y = z = 200;" +"\n\t x = " + x + "\n\t y = "
				+ y + "\n\t z = " + z +  "int b = 20;\n" + "Compound Assignment:\n b += 40;\n\t b = " + b);


	}

}
