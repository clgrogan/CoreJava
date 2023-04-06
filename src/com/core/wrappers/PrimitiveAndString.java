package com.core.wrappers;

public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x = 100;
		String s = Byte.toString(x);
		byte y = Byte.parseByte(s);

		System.out.println("byte x = 100: x = " + x);
		System.out.println("String s = Byte.toString(x): s = " + s);
		System.out.println("byte y = Byte.parseByte(s): y = " + y);

	}

}
