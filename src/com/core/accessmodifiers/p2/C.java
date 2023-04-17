package com.core.accessmodifiers.p2;

import com.core.accessmodifiers.p1.A;

public class C extends A {
	public static void main(String[] args) {
		C objC = new C();
		A objA = new A();
		System.out.println("Class conical name: \n\t" + objC.getClass().getCanonicalName());
		System.out.println("Super Class conical name: \n\t" + objC.getClass().getSuperclass().getCanonicalName());
		System.out.println();
		System.out.println("\nobjA.toString(): " + objA.toString());

		System.out.println("objA.aPrivate: " + "not visible");
		System.out.println("objA.bDefault: " + "not visible");
		System.out.println("objA.cProtected: " + "not visible");
		System.out.println("objA.dPublic: " + objA.dPublic);
		System.out.println();
		System.out.println("objC.toString()(inherited): " + objC.toString());
		System.out.println("objC.aPrivate: " + "not visible");
		System.out.println("objC.bDefault: " + "not visible");
		System.out.println("objC.cProtected: " + objC.cProtected);
		System.out.println("objC.dPublic: " + objC.dPublic);

	}
	
}
