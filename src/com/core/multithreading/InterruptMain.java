package com.core.multithreading;

public class InterruptMain {

	public static void main(String[] args) throws InterruptedException {

		Interrupted i = new Interrupted();
		i.start();
		Thread.sleep(3000);
		i.interrupt();
	}

}
