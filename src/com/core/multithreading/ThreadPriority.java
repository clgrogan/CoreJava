package com.core.multithreading;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		ThreadPriority tp4 = new ThreadPriority();
		
		tp1.setPriority(MIN_PRIORITY);
		tp2.setPriority(MAX_PRIORITY);
		tp3.setPriority(NORM_PRIORITY);
		tp4.setPriority(1);

		tp1.setName("tp1");
		tp2.setName("tp2");
		tp3.setName("tp3");
		tp4.setName("tp4");
		
		tp1.start();
		tp2.start();
		tp3.start();
		tp4.start();
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + "\t" + this.getId() + "\t" + i);
		}
	}
}
