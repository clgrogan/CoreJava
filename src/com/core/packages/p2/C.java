package com.core.packages.p2;
import com.core.packages.p1.A_Dup;

public class C {
	public static void main(String[] args) {
		A_Dup objA = new A_Dup();

		System.out.println("Class conical name: \n\t" + objA.getClass().getCanonicalName());
		System.out.println();
		System.out.println("A.a1();\n"
				+ "objA.a1();\n"
				+ "objA.a2();");
		A_Dup.a1();
		objA.a1();
		objA.a2();
		
		
	}
}
