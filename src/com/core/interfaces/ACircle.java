package com.core.interfaces;

public class ACircle implements Circle, Circle2 {

	@Override
	public void calculateArea(double r) {
		double area = Circle2.pi*r*r;
		System.out.println("A "+this.getClass().getSimpleName()+ " with a radius of " + r + " has an area of " + area);
		
	}

	@Override
	public void calculateArea(float r) {
		float area = Circle2.pi*r*r;
		System.out.println("float: A "+this.getClass().getSimpleName()+ " with a radius of " + r + " has an area of " + area);
		
	}

	@Override
	public void calculateVolume(double r) {
		System.out.println("The two interfaces have a method with the same signature (name and parameter list) and return type. That is OK. Just need one implementation.");
		System.out.println("\nIF the interfaces have the same signature and a DIFFERENT return type, then there will be a compile error.");
		
	}

}
