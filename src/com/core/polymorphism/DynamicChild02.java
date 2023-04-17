package com.core.polymorphism;

public class DynamicChild02 implements DynamicParent{

	@Override
	public void start() {
		System.out.println("DynamicChild02 start();");		
	}

	@Override
	public void stop() {
		System.out.println("DynamicChild2 stop();");
		
	}

}
