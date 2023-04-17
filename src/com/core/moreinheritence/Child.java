package com.core.moreinheritence;

public class Child extends Parent {
	int a, c, d;

	public Child(int a, int b, int c, int d) {
		super(a, b);
		this.a = a;
		this.c = c;
		this.d = d;
//		super(a, b); Constructor call must be the first statement in a constructor
	}

	@Override
	void f1() {
		super.f1();
		System.out.println("f1() in Child.");
	}

	void displayDetails() {
		System.out.println("super.a: " + super.a);
		System.out.println("super.b: " + super.b);
		System.out.println("this.a: " + this.a);
		System.out.println("this.b: " + this.b);
		System.out.println("this.c: " + this.c);
		System.out.println("this.d: " + this.d);
	}

	@Override
	public String toString() {
		return this.getClass().getCanonicalName() + "\n [a=" + a + ", c=" + c + ", d=" + d + ", b=" + b + ",\n getClass()=" + getClass() + ",\n hashCode()="
				+ hashCode() + ",\n toString()=" + super.toString() + "]";
	}
}
