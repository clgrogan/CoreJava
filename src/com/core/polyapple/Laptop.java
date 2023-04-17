package com.core.polyapple;

public abstract class Laptop implements AppleComputer{
	public int batteryLevel;
	public Laptop() {
		this.batteryLevel = checkBatteryLevel();
	}
	protected abstract int checkBatteryLevel();
	@Override
	public String startUp() {
		return "Laptop \tstartUp()";
	}
	@Override
	public String shutDown() {
		return "Laptop \tshutDown()";
	}
}
