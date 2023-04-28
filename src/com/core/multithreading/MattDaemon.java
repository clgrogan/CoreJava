package com.core.multithreading;


public class MattDaemon extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" i: "+ i + " active count: "+Thread.activeCount());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 10) System.out.println(Thread.currentThread().getName()+ " has finished!!!!");
		}
	}

}
