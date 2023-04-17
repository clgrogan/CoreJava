package com.core.polyapple;

public class MacBookAir extends MacBook{

	@Override
	protected int checkBatteryLevel() {
		int n = (int) (Math.random() * 10);
		System.out.println("\t\tMacBookAir checkBatteryLevel() executing and will return \"" + n + "\"");
		return n;
	}

	@Override
	public String startUp() {
		return "MacBookAir \tstartUp()";
	}

	@Override
	public String shutDown() {
		return "MacBookAir \tshutDown()";
	}
}
