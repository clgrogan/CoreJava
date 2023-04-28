package com.core.threadgroups;

public class ThreadGroupApp {
	public static void main(String[] args) {
		System.out.println("Group Name:       \t" + Thread.currentThread().getThreadGroup().getName());
		System.out.println("Parent Group Name:\t" + Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("Parent Group Name:\t" + Thread.currentThread().getThreadGroup().getParent().getParent());
		
		ThreadGroup parent = new ThreadGroup("Parent");
		ThreadGroup child = new ThreadGroup(parent, "Child");
		System.out.println("parent Group Name:       \t" + parent.getName());
		System.out.println("child Group Name:       \t" + child.getName());
		System.out.println("child's parent Group Name:\t" + child.getParent().getName());
		parent.setMaxPriority(7);
		Thread t1 = new Thread(child, "First Child");
		t1.setPriority(10);
		System.out.println("t1 priority: " + t1.getPriority());
		Thread t2 = new Thread(child, "Second Child");
		Thread t3 = new Thread(child, "Third Child");
		System.out.println("\nt1 Name:\t" + t1.getName());
		System.out.println("t1 Group:\t" + t1.getThreadGroup().getName() + " & "+t1.getThreadGroup().getParent().getName());
	}
}
