package com.core.multithreading;

public class ThreadNameID extends Thread {

	public static void main(String[] args) {
		ThreadNameID ti = new ThreadNameID();
		ti.start();
		Thread.currentThread().setName("Main stuff");
		printThreadInfo();
	}

	private static void printThreadInfo() {
		System.out.println(
				"\nThread Name & ID: " + Thread.currentThread().getName() + " & " + Thread.currentThread().getId());

	}

	@Override
	public void run() {
		this.setName("Kujo");
		printThreadInfo();

	}

}
