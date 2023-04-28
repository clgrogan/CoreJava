package com.core.multithreading;

public class Interrupted extends Thread {
	int napTime;

	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I'm taking a little nap here.");
				Thread.sleep(2000);
				napTime += 2000;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(
					"Seriously! I was sleeping here and was only able to sleep for about" + napTime + " milliseconds.");

		}
	}
}
