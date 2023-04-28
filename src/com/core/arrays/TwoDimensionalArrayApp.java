package com.core.arrays;

public class TwoDimensionalArrayApp {

	public static void main(String args[]) {
		int[][] matrix = {{0,1,2},{3,4,5},{6,7,8,9}};
		
		for(int[] eArr: matrix) {
			for(int e: eArr) {
				System.out.print(e+ "\s");
			}
			System.out.println();
		}
	}
}
