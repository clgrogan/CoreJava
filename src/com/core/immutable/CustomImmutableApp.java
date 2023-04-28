package com.core.immutable;

public class CustomImmutableApp {

	public static void main(String[] args) {

		CustomImmutable obj1 = new CustomImmutable(20);
		CustomImmutable obj2 = obj1.change(20);
		CustomImmutable obj3 = obj1.change(100);
		
		System.out.println("obj1: "+ obj1);
		System.out.println("obj2: "+ obj2);
		System.out.println("obj3: "+ obj3);

	}

}
