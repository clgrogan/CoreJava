package com.core.inheritance;

public abstract class AbstractVsFinal {
	abstract void start();
	final void end() {
		System.out.println("Final method in an abstract class.");
	}

}
