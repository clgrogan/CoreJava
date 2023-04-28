package com.core.threadgroups;

public class ThreadGroupMethodApp {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup tGroup = new ThreadGroup("Cool Thread Group");
		ThreadGroup tGroup2 = new ThreadGroup(tGroup, "Minions TG");

		CustomThread t1 = new CustomThread(tGroup, "First Thread");
		CustomThread t2 = new CustomThread(tGroup, "2nd Thread");
		CustomThread t3 = new CustomThread(tGroup, "Third Thread");
		CustomThread t4 = new CustomThread(tGroup2, "The FOURTH Thread");
		t4.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		System.out.println("tGroup.activeCount(): "+ tGroup.activeCount());
		tGroup.list();

		Thread.sleep(1000);
		System.out.println("tGroup.activeCount(): " + tGroup.activeCount());
		Thread.sleep(2000);
		System.out.println("tGroup.activeCount(): " + tGroup.activeCount());
		Thread.sleep(3000);
		System.out.println("tGroup.activeCount(): " + tGroup.activeCount());
		
		tGroup.list();
	}

}
