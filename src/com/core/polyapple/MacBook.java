package com.core.polyapple;

public class MacBook extends Laptop {

	@Override
	protected int checkBatteryLevel() {
		int n = (int) (Math.random() * 100);
		System.out.println("\t\tMacBook checkBatteryLevel() executing and will return \"" + n + "\"");
		return n;
	}

	@Override
	public String startUp() {
		return "MacBook \tstartUp()";
	}

	@Override
	public String shutDown() {
		return "MacBook \tshutDown()";
	}
}
