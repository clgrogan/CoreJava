package com.core.synchronization.blocks;

public class BlockSynch extends Thread {
	DisplayMessage dm;
	String name;
	public BlockSynch(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	@Override
	public void run() {
		this.dm.sayHello(name);
	}

}
