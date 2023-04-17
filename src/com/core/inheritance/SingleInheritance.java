package com.core.inheritance;

public class SingleInheritance {
	void m1() {
		System.out.println("inside m1()");
	}
	
	static public void main(String[] barks) {
		SingleInheritance s = new SingleInheritance();
		s.m1();
		s.hashCode();
		s.getClass();
	}
}
