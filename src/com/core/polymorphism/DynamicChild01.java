package com.core.polymorphism;

public class DynamicChild01 implements DynamicParent{

	@Override
	public void start() {
		System.out.println("DynamicChild01 start();");
		
	}

	@Override
	public void stop() {
		System.out.println("DynamicChild01 stop();");
		
	}

}
