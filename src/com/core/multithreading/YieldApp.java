package com.core.multithreading;

public class YieldApp {

	public static void main(String[] args) {
		Yielder y = new Yielder();
		y.start();
		YieldNot yn = new YieldNot();
		yn.start();
		
		for(int i = 1; i<=10; i++) System.out.println("main thread.");
		
	}

}
