package com.core.synchronization;

public class SynchDisplayMessage {
	synchronized public void sayHello(String name) {
		for (int i = 0; i < 10; i++) System.out.println("How are you, " + name + "?");

	}
}
