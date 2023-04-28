package com.core.garbage;

public class GarbageApp {
	int objId;
	
	public GarbageApp(int objId) {
		this.objId = objId;
		System.out.println(this.objId + " Created.");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Garbage Collection Demo");
			new GarbageApp(0);
			new GarbageApp(1);
		for (int i = 0; i < 100; i++) {
			System.out.println("it: "+ i);
			System.gc();
		}
		for (int i = 0; i < 600000; i++) {
			new GarbageApp(i);
		}
		Thread.sleep(2000);
		System.out.println("\nWill requesting gc more clean up more?");
		

		for (int i = 0; i < 10; i++) {
			System.out.println("Wait 2s and execute System.gc() iteration: " + (i+1));
			Thread.sleep(2000);
			System.gc();
		}
		
//		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		// Likely won't access unless JVM memory limits pushed.
		System.out.println(objId + " Finalized.");
	}

}
