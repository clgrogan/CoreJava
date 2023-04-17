package com.core.moreinheritence;

public class ChainConstructors extends Super{
	public ChainConstructors() {
		this(10);
		System.out.println(this.getClass().getCanonicalName()+ "\n ChainConstructors No Arg Constructor.");
	}
	ChainConstructors(int x) {
		super(x);
		System.out.println(this.getClass().getCanonicalName()+ "\n ChainConstructors (int x) Arg Constructor.");
	}
	public static void main(String[] args) {
		ChainConstructors chain = new ChainConstructors();
	}
}
