package com.core.synchronization;

public class SynchApp {

	public static void main(String[] args) {
		System.out.println("Synchronization Keyword Demonstration");
		SynchDisplayMessage sdm = new SynchDisplayMessage();

		SynchThread st1 = new SynchThread(sdm, "Havi");
		SynchThread st2 = new SynchThread(sdm, "Trey");
		
		st1.start();
		st2.start();
		
	}

}
