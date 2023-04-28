package com.core.katas;

public class StringReversal {

	public static void main(String[] args) {
		String s1 = "abcdefg";

		String s2 = reverse1(s1);
		String s3 = reverse2(s2);
		String s4 = reverse3(s1);
		System.out.println("s1: " + s1);
		System.out.println("\nString s2 = reverse1(s1);");
		System.out.println("s2: " + s2);
		System.out.println("\nString s3 = reverse2(s2);");
		System.out.println("s3: " + s3);

	}

	private static String reverse1(String baseString) {
		String[] letters = baseString.split("");
		String reversed = "";

		for (int i = letters.length - 1; i >= 0; i--) {
			reversed += letters[i];
		}

		return reversed;
	}

	private static String reverse2(String baseString) {
		String reversed = "";

		for (int i = baseString.length() - 1; i >= 0; i--) {
			reversed += baseString.charAt(i);
		}
		return reversed;
	}

	private static String reverse3(String baseString) {
		byte bytes[] = baseString.getBytes();
		byte[] bytesReversed = new byte[bytes.length];
		for (int i = bytes.length - 1; i >= 0; i--) {
			System.out.println(i);
			bytesReversed[bytes.length - i-1] = bytes[i];
		}
		;
		return new String(bytesReversed);
	}

}
