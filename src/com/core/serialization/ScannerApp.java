package com.core.serialization;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\nScanner InputStream Demonstration\n");
		hasNextDemo();
		Employee emp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id, name, salary, ssn");
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		int ssn = sc.nextInt();

		emp = new Employee(id, name, salary, ssn);

		System.out.println("\nEmployee created using your input: " + emp);
		System.out.println();
		sc.close();
		Thread.sleep(2500);
		hasNextDemo();

	}

	private static void hasNextDemo() throws InterruptedException {
		System.out.println("Scanner hasNext*() Demonstration\n");
		Thread.sleep(1000);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integers for which you want the sum");
		System.out.println("\tType 'X' and enter to calculate");
		double sum = 0;
		while (sc.hasNextInt()) {
			sum += sc.nextInt();
		}
		
		System.out.println("\nThe sum of your numbers is: "+ sum);
		System.out.println();
		sc.close();
	}

}
