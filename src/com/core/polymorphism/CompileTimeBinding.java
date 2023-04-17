package com.core.polymorphism;

public class CompileTimeBinding {
	
	void add(int a, int b) {
		System.out.println("Result: "+ (a+b));
	}
	void add(float a, float b) {
		System.out.println("Result: "+(a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("Result: "+ (a+b+c));
	}
	
	
	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(10,20);
		obj.add(10,20,30);
		obj.add(30f, 40f);
	}

}
