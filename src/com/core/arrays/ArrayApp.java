package com.core.arrays;

public class ArrayApp {

	public static void main(String[] args) {
		int[] arr1 = { 20, 30, 40, 50 };

		int arr2[] = new int[5];
		arr2[0] = 90;
		arr2[1] = new Integer(80); // Autoboxing cast Integer to int.
		arr2[2] = 30;

		System.out.println("\nPrint Elements of arr1");
		for (int e : arr1)
			System.out.println("\t" + e);
		System.out.println("\nPrint Elements of arr2");
		for (int e : arr2)
			System.out.println("\t" + e);

		System.out.println("\n Uninitialized arrays.");
		boolean[] boolArr = new boolean[5];
		byte[] byteArr = new byte[5];
		char[] charArr = new char[5];
		short[] shortArr = new short[5];
		int[] intArr = new int[5];
		long[] longArr = new long[5];
		float[] fArr = new float[5];
		double[] dArr = new double[5];
		Integer[] integerArr = new Integer[5];
		String[] sArr = new String[5];

		System.out.println("\nUninitialize bool array");
		for (boolean e : boolArr)
			System.out.println("\tbool: " + e);

		System.out.println("\nUninitialize byte array");
		for (byte e : byteArr)
			System.out.println("\tbyte: " + e);

		System.out.println("\nUninitialize char array");
		for (char e : charArr)
			System.out.println("\tchar: " + e);

		System.out.println("\nUninitialize short array");
		for (short e : shortArr)
			System.out.println("\tshort: " + e);

		System.out.println("\nUninitialize int array");
		for (int e : intArr)
			System.out.println("\tint: " + e);

		System.out.println("\nUninitialize long array");
		for (long e : longArr)
			System.out.println("\tlong: " + e);

		System.out.println("\nUninitialize float array");
		for (float e : fArr)
			System.out.println("\tfloat: " + e);

		System.out.println("\nUninitialize double array");
		for (double e : dArr)
			System.out.println("\tdouble: " + e);

		System.out.println("\nUninitialize Integer array");
		for (Integer e : integerArr)
			System.out.println("\tInteger: " + e);

		System.out.println("\nUninitialize String array");
		for (String e : sArr)
			System.out.println("\tString: " + e);
		maxArraySize();
	}

	private static void maxArraySize() {
		int sizePrintIncrement = 10000000;
		int sizeBuildIncrement = 10000000;
		long incrementStart = System.currentTimeMillis();
		String maxArray[] = null;
		for (int i = 000; i < 1000000000; i += sizeBuildIncrement) {
			maxArray = new String[i];
			if (i % sizePrintIncrement == 0) {
				System.out.println("maxArray.length: " + maxArray.length + " \t increment elapsed: "
						+ ((System.currentTimeMillis() - incrementStart)) + " milliseconds.");
				incrementStart = System.currentTimeMillis();
			}

			System.out.println("VM limit exceded at size: \t" + i);

		}
	}

}
