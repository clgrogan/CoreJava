package com.core.synchronization;

public class SynchThread extends Thread {
	SynchDisplayMessage dm;
	String name;
	public SynchThread(SynchDisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	@Override
	public void run() {
		this.dm.sayHello(name);
	}

}
