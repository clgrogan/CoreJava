package com.core.packages.p2;
//import com.core.packages.p1.A_Dup;

public class UsingDuplicateClassNames {

	public static void main(String[] args) {
		System.out.println("\nA_Dup.a1();");
		A_Dup.a1();
		System.out.println("\npcom.core.packages.p1.A_Dup.a1();");
		com.core.packages.p1.A_Dup.a1();

	}

}
