package com.core.multithreading.executer_framework;

public class CheckProcessorTask implements Runnable {
	String name;
	
	
	
	public CheckProcessorTask(String name) {
		this.name = name;
	}



	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(name + " FINISHED processing check " + threadName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(name + " FINISHED processing check " + threadName);
	}

}
