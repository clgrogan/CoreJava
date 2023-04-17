package com.core.packages.p2;

public class FullyQualified {

	public static void main(String[] args) {
		com.core.packages.p1.A_Dup objA = new com.core.packages.p1.A_Dup();

		System.out.println("Current class: \t" + FullyQualified.class.getCanonicalName());
		System.out.println("objA class: \t" + objA.getClass().getCanonicalName());
		System.out.println();
		System.out.println("com.core.packages.p1.A.a1();\n"
				+ "objA.a1();\n"
				+ "objA.a2();");
		com.core.packages.p1.A_Dup.a1();
		objA.a1();
		objA.a2();

	}

}
