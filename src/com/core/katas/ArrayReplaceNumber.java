package com.core.katas;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Taking an int[] replace each element with value of 5 with a 0, if the prior
 * element is a 3.
 * 
 */
public class ArrayReplaceNumber {

	public static void main(String[] args) {
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		System.out.println("Initial array: " + Arrays.toString(arr));

		System.out.println("Result array:  " + Arrays.toString(replaceNumberAfterNumber(5, 3, arr)));

		// modify original
		System.out.println();
		arr[arr.length-2]=3;
		arr[arr.length-1]=5;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] == 3 && arr[i + 1] == 5)
				arr[i + 1] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

	private static int[] replaceNumberAfterNumber(int replace, int after, int[] arr) {
		int[] resultArr = arr.clone();
		for (int i = 1; i < resultArr.length; i++) {
			if (resultArr[i] == replace && resultArr[i - 1] == after) {
				resultArr[i] = 0;
				System.out.println("replaced number at index: "+ i);
			}
		}

		return resultArr;
	}

}
