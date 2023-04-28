package com.core.synchronization.blocks;

public class DisplayMessage {
	public void sayHello(String name) {
		// Any code can go here and execute until it reaches the synchronized block.

//		for (int i = 0; i < 10; i++)
//			System.out.println("\tnon-synced for you, " + name);

		synchronized (DisplayMessage.class) // Blocks all execution at the class or object of class.
	 // synchronized (this) // blocks execution by this object/instance.

		{
			for (int i = 0; i < 10; i++)
				System.out.println("How are you, " + name + "?");
		}
	}
	
	public void buhBye(Object obj, String name) {

		for (int i = 0; i < 10; i++)
			System.out.println("\tnon-synced buh-bye, " + name);

		synchronized (obj)

		{
			for (int i = 0; i < 10; i++)
				System.out.println("How are you, " + name + "?");
		}
		
	}
}
