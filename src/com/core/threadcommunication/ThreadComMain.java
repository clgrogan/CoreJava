package com.core.threadcommunication;

public class ThreadComMain {

	public static void main(String[] args) throws InterruptedException {
		MyThread noSyncCom = new MyThread();
		noSyncCom.start();

		System.out.println("\nNo synchronization. No communication.");
		System.out.println("Total:\t" + noSyncCom.total);
		
		MyThread sync = new MyThread();
		sync.start();
			System.out.println("\nSynchronized");
			System.out.println("Total:\t" + sync.total);
		synchronized (sync) {
			System.out.println("Main thread is going to wait");
			sync.wait(); // Releases lock
			System.err.println("Main thread is notified.");
			System.out.println("\nSynchronized with obj.wait()");
			System.out.println("Total:\t" + sync.total);
		}

	}

}
