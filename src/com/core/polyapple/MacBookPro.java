package com.core.polyapple;

public class MacBookPro extends MacBook{
	private String powerMode;
	public MacBookPro() {
		this.powerMode = "Extended";
	}
	@Override
	public String startUp() {
		return "MacBookPro \tstartUp()";
	}
	@Override
	public String shutDown() {
		return "MacBookPro \tshutDown()";
	}
	public String getPowerMode() {
		return powerMode;
	}
	public void setPowerMode(String powerMode) {
		this.powerMode = powerMode;
	}
	
}
