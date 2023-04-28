package com.core.threadpool;

public class Thread01 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			if (i != 5) {
				System.out.println("\t" + i+"\t\t"+this.getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				System.out.println("Get your booty on the floor."+"\t\t"+this.getName());

		}
	}

}
