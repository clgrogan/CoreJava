package com.core.abstractclasses;

public class Circle3 extends Circle {

	public Circle3(int r) {
		super(r);
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter: " + this.r * 2 * com.core.interfaces.Circle.pi);

	}

}
