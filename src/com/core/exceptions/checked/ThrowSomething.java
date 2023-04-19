package com.core.exceptions.checked;

import java.util.Iterator;

public class ThrowSomething {
	static String[] cars = new String[]{"Jeep", "BMW", "Mercedes", "Hummer","Toyota"};

	public static void main(String[] args) {

		System.out.println("start main");
		
		for (int i = 0; i < 10; i++) {
			try {
				throwUnchecked(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (String car: cars)
			try {
				throwChecked(car);
			} catch (CustomChecked e) {
				e.printStackTrace();
				e.getMessage();
			}
		
		System.out.println("end main");
	}

	private static void throwChecked(String car) throws CustomChecked {
		String validCar = "BMW";
		if (car != validCar) throw new CustomChecked(validCar,car);
		
	}

	private static void throwUnchecked(int i) {
		if (i%2 == 0) throw new CustomUncheckedException();
		else throw new RuntimeException("NO odd numbers allowed");
		
	}

}
