package com.core.immutable;

public class StringPoolApp {
	static String s4 = new String("abc");

	public static void main(String[] args) {
		User user1 = new User(1, "bob");
		User user2 = new User(2, "bob");
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "abd";
		String s4 = new String("abc");

		System.out.println("\nString Pool Demo\n");

		System.out.println("Initial value and mem location (hashcode):\n\tuser1: " + user1 + "   memLocation: "
				+ System.identityHashCode(user1) + "\n\tuser2: " + user2 + "   memLocation: " + System.identityHashCode(s2) + "\n\ts1: " + s1
				+ "   memLocation: " + System.identityHashCode(s1) + "\n\ts2: " + s2 + "   memLocation: " + System.identityHashCode(s2) + "\n\ts3: "
				+ s3 + "   memLocation: " + System.identityHashCode(s3) + "\n\ts4: " + s4 + "   memLocation: " + System.identityHashCode(s4));
		System.out.println("static variable StringPoolApp.s4: \n\ts4: " + StringPoolApp.s4 + "   memLocation: " + System.identityHashCode(StringPoolApp.s4));
		System.out.println("\n\nString Comparison");
		System.out.println("\ts1 == s2:\t" + (s1 == s2));
		System.out.println("\ts1.equals(s2):\t" + s1.equals(s2));
		System.out.println("\ts1 == s3:\t" + (s1 == s3));
		System.out.println("\ts1.equals(s3):\t" + s1.equals(s3));
		System.out.println("\ts2 == s3:\t" + (s2 == s3));
		System.out.println("\ts2.equals(s3):\t" + s2.equals(s3));
		System.out.println("\ts1 == s4:\t" + (s1 == s4));
		System.out.println("\ts1.equals(s4):\t" + s1.equals(s4));
		s1.hashCode();

	}

}