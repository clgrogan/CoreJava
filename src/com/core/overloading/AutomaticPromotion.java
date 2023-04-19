package com.core.overloading;

public class AutomaticPromotion {
	public void print(boolean bool) {
		System.out.println("boolean version: " + bool);
	};
	public void print(byte b) {
		System.out.println("byte version: " + b);
	};

	public void print(char c) {
		System.out.println("char version: " + c);
	};

	public void print(short s) {
		System.out.println("short version: " + s);
	};

	public void print(int i) {
		System.out.println("int version: " + i);
	};

	public void print(long l) {
		System.out.println("long version: " + l);
	};

	public void print(float f) {
		System.out.println("float version: " + f);
	};

	public void print(double d) {
		System.out.println("double version: " + d);
	};

	public void print(String s) {
		System.out.println("String version: " + s.toString());
	}

	public void print(Object o) {
		System.out.println("Object version: " + o.toString());
	}

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(false);
		ap.print((byte) 127);
		ap.print((char) '\u0061');
		ap.print((short) 166);
		ap.print((int) 100000);
		ap.print(35007l);
		ap.print(123.4f);
		ap.print(266.77d);
		ap.print("Some text.");
	}

}
