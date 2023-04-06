package com.core.staticstuff;

public class StaticBlockInClass {
	public boolean bool;

	public static void printIt(Object o) {
		System.out.println("\n: " + o.toString() + "\n");
	}

	static {
		System.out.println("\n static bock of code in: " 
				+ "\n\tStaticBlockInClass.class.getSimpleName(): " + StaticBlockInClass.class.getSimpleName());
	}

}