/**
 * 
 */
package com.core.katas;

import java.util.Arrays;

/**
 * @author cgrogan
 * 
 *         sum the elements of an int[]
 *
 */
public class ArraySumElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;

		for (int e : a) {
			sum += e;
		}
		System.out.println("\nSum the Elements of an int Array");
		System.out.println("\nArray: " + Arrays.toString(a));
		System.out.println("\nResult: " + sum);

	}

}
