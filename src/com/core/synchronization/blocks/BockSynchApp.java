package com.core.synchronization.blocks;

public class BockSynchApp {

	public static void main(String[] args) {
		System.out.println("Synchronization Keyword Demonstration");
		DisplayMessage sdm = new DisplayMessage();
		DisplayMessage sdm2 = new DisplayMessage();

		BlockSynch st1 = new BlockSynch(sdm, "Havi");
		BlockSynch st2 = new BlockSynch(sdm2, "Trey");
		
		st1.start();
		st2.start();
		
	}

}
