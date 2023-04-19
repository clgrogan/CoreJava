package com.core.exceptions;

public class ArrayIndexOB {

	public static void main(String[] args) {

		int arr[] = {1,2,3};
		try {
			for (int i = 0; i <= arr.length; i++) 
				System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("\n  Oops. Something went wrong. Don't worry, it did not break anything. \n");
		}
		
			
		
		System.out.println("Yup. Exception was thrown and this never executes. :-(... Unless it was handled!!!");
	}

}
