package com.core.abstraction;

public abstract class BMW {
	void commonFunct() {
		System.out.println("commonFunc() method in BMW");
	}
	
	abstract void accelerate();
	public static void main(String[] args) {
		System.out.println("Inside the main method of the abstract BMW class.");
		
		// Cannot make a static reference to the non-static method commonFunct() from the type BMW
//		commonFunct();
	}

}
