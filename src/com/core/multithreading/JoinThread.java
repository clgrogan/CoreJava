package com.core.multithreading;

import java.util.Scanner;

public class JoinThread extends Thread {
	
	static int n, sum = 0;

	public static void main(String[] args) {
		System.out.println(
				"When the Thread.join method on a Thread object is invoked,\nthe calling thread goes into a waiting state until the\nchild thread completes.");
		
		// Get the input from a user to get an integer value,
		// Use a separate thread call to sum the numbers up to and including the value.
		// Print out the result in the calling thread.
		
		System.out.println("Sum of the numbers up to and including 'N' numbers");
		System.out.println("Enter a positive integer");
		Scanner sc = new Scanner(System.in);
		JoinThread.n = sc.nextInt();
		
		JoinThread tj = new JoinThread();
		tj.start();
		try {
			tj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nSum of integers up to and including \" "+JoinThread.n+" \" is "+JoinThread.sum+".");
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= JoinThread.n; i++) {
			JoinThread.sum +=i;
			try {
				Thread.sleep(111);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
