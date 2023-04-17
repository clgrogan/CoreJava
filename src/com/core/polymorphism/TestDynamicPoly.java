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
		
		DynamicChild01 dyno3 = (DynamicChild01) dyno1;
		dyno3.start();
		dyno3.stop();
		
		DynamicChild02 dyno4 = (DynamicChild02) dyno2;
		dyno4.start();
		dyno4.stop();
		
		ConcreteParent concreteParent = new ConcreteParent();
		ConcreteChild concreteChild = new ConcreteChild();
		
		ConcreteParent castToRent = new ConcreteChild();

		System.out.println("Regular child someMethod(): " + concreteChild.someMethod());
		System.out.println("Regular parent someMethod(): " + concreteParent.someMethod());
		System.out.println("Upcast child to parent someMethod(): " + castToRent.someMethod());
		
		// Cannot downcast if the underlying object is not the same type as the cast to type or higher.
		ConcreteChild castToChild = (ConcreteChild) new ConcreteParent(); //runtime exception
		System.out.println("Downcast parent to child someMethod(): " + castToChild.someMethod());
	}

}
