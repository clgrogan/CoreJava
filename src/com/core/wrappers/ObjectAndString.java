package com.core.wrappers;

public class ObjectAndString {

	public static void main(String[] args) {
		Long l = 1000L;
		String s = Long.toString(l);
		String s2 = l.toString();
		Long l2 = Long.valueOf(s);

		System.out.println("Long l = 1000L: l = " + l);
		System.out.println("String s = Long.toString(l): s = " + s);
		System.out.println("String s2 = l.toString(): s2 = " + s2);
		System.out.println("Long l2 = Long.valueOf(s): l2 = " + l2);

	}

}
