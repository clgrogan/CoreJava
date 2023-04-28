package com.core.threadpool;

public class Runner implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1001);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nExecuting run() on the Runner class which implements Runnable interface. getName: "
					+ Thread.currentThread().getName()+ ", iteration: " + i+"\n");

		}

	}

}
