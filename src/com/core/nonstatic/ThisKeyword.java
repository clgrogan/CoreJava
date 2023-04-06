package com.core.nonstatic;

public class ThisKeyword {
	int x;
	
	public ThisKeyword() {
		System.out.println("this: " + this);
		System.out.println("this.x: " + this.x);
	}
	public static void main(String[] args) {
		new ThisKeyword();
		new ThisKeyword();
	}

}
