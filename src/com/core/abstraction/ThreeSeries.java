package com.core.abstraction;

public class ThreeSeries extends BMW implements Manufacturer{

	@Override
	void accelerate() {
		System.out.println("accelerate() inside ThreeSeries");

	}

	@Override
	public void location() {
		System.out.println("location() inside ThreeSeries.");
		
	}
	@Override
	public String defaultMethod() {
		
		return "duh";
	}

}
