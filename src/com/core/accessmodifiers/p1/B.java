package com.core.accessmodifiers.p1;

public class B {

	public static void main(String[] args) {
		A objA = new A();
//		objA.a; a is not visible from this location
		System.out.println("\nAccessing an object of type A from class B.");
		System.out.println("objA.aPrivate: "+ "The field A.a is not visible.");
		System.out.println("objA.bDefault: "+objA.bDefault);
		System.out.println("objA.cProtected: "+objA.cProtected);
		System.out.println("objA.dPublic: "+objA.dPublic);
	}

}
