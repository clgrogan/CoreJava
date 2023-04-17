package com.core.accessmodifiers.p2;

import com.core.accessmodifiers.p1.A;

public class D {

	public static void main(String[] args) {
		D objD = new D();
		A objA = new A();
		System.out.println("Class conical name: \n\t" + objD.getClass().getCanonicalName());
		System.out.println("Super Class conical name: \n\t" + objD.getClass().getSuperclass().getCanonicalName());
		System.out.println();
		System.out.println("\nobjA.toString(): " + objA.toString());

		System.out.println("objA.aPrivate: " + "not visible");
		System.out.println("objA.bDefault: " + "not visible");
		System.out.println("objA.cProtected: " + "not visible");
		System.out.println("objA.dPublic: " + objA.dPublic);
		System.out.println();

	}

}
