package com.core.innerclasses;

public class StaticInnerClassDemo {
	
	public static void main(String[] args) {
		System.out.println("Static Inner Class Demonstraion.");
		System.out.println("\tstatic void meth1(){...}");
		System.out.println("\tstatic class Inner{\n"
				+ "\t		static void meth1() {...}"
				+ "\t		void meth2() {...}");

		System.out.println("\nDemo'd from the outer/wrapper\n class main method");
		System.out.println("\nmeth1();");
		meth1();
		System.out.println("\nInner.meth1();");
		Inner.meth1();
		System.out.println("\nInner innie = new Inner();\ninnie.meth2();");
		Inner innie = new Inner();
		innie.meth2();
		Inner inner = new Inner();
		inner.meth2();
	}
	
	static void meth1() {
		System.out.println("\tOuter's static method execution.");
	}
	static class Inner{
		static void meth1() {
			System.out.println("\tInner's static method execution.");
		}
		void meth2() {
			System.out.println("\tInner's instance method execution.");
		}
	}
}
