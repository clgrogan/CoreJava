package com.core.polymorphism;

public class TestDynamicPoly {

	public static void main(String[] args) {
		DynamicParent dyno1 = new DynamicChild01();
		DynamicParent dyno2 = new DynamicChild02();
		
		System.out.println("DynamicParent dyno1 = new DynamicChild01();\n"
				+ "DynamicParent dyno2 = new DynamicChild02();");
		dyno1.start();
		dyno1.stop();
		dyno2.start();
		dyno2.stop();
	}

}
