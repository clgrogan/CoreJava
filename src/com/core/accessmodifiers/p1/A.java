package com.core.accessmodifiers.p1;

public class A {
	private int aPrivate = 30;
	int bDefault = 40;
	protected int cProtected = 50;
	public int dPublic = 60;

	public static void main(String[] args) {
		A objA = new A();
		System.out.println("\nAccessing an object of type A from class A.");
		System.out.println("objA.a: " + objA.aPrivate);
		System.out.println("objA.b: " + objA.bDefault);
		System.out.println("objA.c: " + objA.cProtected);
		System.out.println("objA.d: " + objA.dPublic);
	}

	@Override
	public String toString() {
		return "A [aPrivate=" + aPrivate + ", bDefault=" + bDefault + ", cProtected=" + cProtected + ", dPublic="
				+ dPublic + "]";
	}


	
}
