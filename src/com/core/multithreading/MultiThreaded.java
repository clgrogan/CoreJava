package com.core.multithreading;

public class MultiThreaded extends Thread{

	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(" main i: "+ i);
			Thread.sleep(100);
		}
		

	}
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("i: "+ i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted. Exiting run.");
			}
		}
		
	}
}
