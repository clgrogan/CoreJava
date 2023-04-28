package com.core.multithreading;

public class Yielder extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i<=10;i++) {
			System.out.println("Child thread.");
			Thread.yield();
		}
	}
}
