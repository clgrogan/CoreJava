package com.core.moreinheritence;

public class Super {
	int x;
	public Super() {
		System.out.println(this.getClass().getCanonicalName()+ " Super/Parent No Arg Constructor.");
	}
	public Super(int x) {
		this();
		this.x = x;
		System.out.println(this.getClass().getCanonicalName()+ " Super/Parent (int x) Arg Constructor.");
	}
	
}
