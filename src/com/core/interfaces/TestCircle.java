package com.core.interfaces;
import com.core.abstractclasses.Circle;

public class TestCircle {
	public static void main(String[] args) {
		ACircle circle = new ACircle();
		circle.calculateArea(10d);
		circle.calculateArea(10f);
		
		com.core.abstractclasses.Circle abstractCircle = new com.core.abstractclasses.Circle3(12);
		abstractCircle.perimeter();
		
		
	}
}
