package com.core.staticstuff;

public class StaticStuff {
	private StaticBlockInClass staticBlockyThing = new StaticBlockInClass();
	public static void main(String[] args) {
		System.out.println("\nYup. That just happened.");

	}

	static {
		System.out.println("\nWe are getting some static up in here! \t# 01");

		dummy();
	}

	static {
		System.out.println("\nWe are getting some static up in here! \t# 02");
		StaticBlockInClass.printIt("Call to a static method in uninstantiated StaticBlockInClass.printIt(). \nStaticBlockInClass happens to have a static block of code as well.");
	}

	static private String dummy() {
		System.err.println("\nYou dummy! You caused an error in this private static method.");
		return null;
	}
}
