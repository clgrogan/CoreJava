package com.core.nonstatic;

public class Demo {

	static Demo obj;

	static {
		System.out.println("Demo.obj: " + Demo.obj);
		Demo.obj = Demo.init();
	}

	public static void main(String[] args) {
		System.out.println("Demo.obj: " + Demo.obj);
	}
	
	static Demo init() {
		return new Demo();
	}
}
