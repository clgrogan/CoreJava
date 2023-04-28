package com.core.threadcommunication;

public class MyThread extends Thread {
	int total;

	@Override
	public void run() {
		System.out.println("Child Thread is calculating the sum:");
		synchronized (this) {
			for (int i = 1; i <= 100; i++)
				total += i;
			this.notify();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child thread after notify, then sleeping for 2 seconds.");
		}
	}
}
