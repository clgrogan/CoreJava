package com.core.multithreading;

public class YieldNot extends Thread {
	
	@Override
	public void run() {
		this.setName("Urban Myth: "+getName());
		for (int i = 1; i < 22;i++) {
			System.out.println(this.getName() + " " + i);
		}
	}

}
