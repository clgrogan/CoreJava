package com.core.innerclasses.anonymous;

public class AnonRunnable {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(" Inside anonymous inner class using Runnable interface.\n\tFor when you absolutely, positively have no interest in reusing code.");	
				}
				
			}
		};
		Thread t = new Thread(runnable);
		t.start();

	}

}
