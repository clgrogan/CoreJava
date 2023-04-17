package com.core.abstraction;

public class TestBMW {

	public static void main(String[] args) {
		BMW bmw = new ThreeSeries();
		ThreeSeries threeSeries = new ThreeSeries();
		FiveSeries fiveSeries = new FiveSeries();
		
		threeSeries.accelerate();
		threeSeries.commonFunct();
		threeSeries.location();
		
		System.out.println(threeSeries.defaultMethod());;
		System.out.println(Manufacturer.staticMethod());
		
		fiveSeries.accelerate();
		fiveSeries.commonFunct();
		
		bmw.accelerate();
		bmw.commonFunct();

	}

}
