package com.core.multithreading;

public class DaemonApp {

	public static void main(String[] args) throws InterruptedException {
		Thread mainThread = Thread.currentThread();
		System.out.println("Thread.currentThread().isDaemon(): " + mainThread.isDaemon());

		try {
			mainThread.setDaemon(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		MattDaemon t0 = new MattDaemon();
		System.out.println("t0.start(): ");
		t0.setName("Matt Daemon");
		t0.start();
		System.out.println("main thread next line after t0.start();");
		System.out.println("main thread: Thread.sleep(5000);");
		Thread.sleep(5000);

		System.out.println();
		MattDaemon t1 = new MattDaemon();
		t1.setDaemon(true);
		System.out.println("t1.isDaemon(): " + t1.isDaemon());
		System.out.println("t1.start(): ");
		t1.start();
		System.out.println("main thread next line after t1.start();");
		System.out.println("End of main thread ends with.\n\tActive count: " + Thread.activeCount());

	}

}
