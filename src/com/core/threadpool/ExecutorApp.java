package com.core.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorApp {

	public static void main(String[] args) {
		
		useThread();
		useRunnable();
		useExecutor();

	}

	private static void useRunnable() {
		Runnable runner = new Runner();
		Thread thread = new Thread(runner);
		thread.start();
		
	}

	private static void useThread() {
		Thread thread = new Thread01();
		thread.start();
		
	}
	
	private static void useExecutor() {
		System.out.println("The ExecuterService example below has two threads specified.\nRegardless of how many tasks (threads or runnable) are submitted, only \ntwo threads will execute at a time for this pool.");
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		threadPool.submit(new Thread01());
		threadPool.submit(new Runner());
		threadPool.submit(new Runner());
		threadPool.submit(new Runner());
		threadPool.submit(new Runner());
		threadPool.submit(new Runner());
		threadPool.shutdown();
	}

}
