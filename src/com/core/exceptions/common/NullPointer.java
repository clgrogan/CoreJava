package com.core.exceptions.common;

public class NullPointer {

	public static void main(String[] args) {
		
		String s = null;
		System.out.println("		String s = null;\n"
				+ "		System.out.println(s.length());");
		System.out.println(s.length());

	}

}
