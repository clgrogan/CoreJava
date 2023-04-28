package com.core.multithreading;

public class SingleThreaded {

	public static void main(String[] args) {
		
		SingleThreaded st = new SingleThreaded();
		st.printNumbers();
		
		for (int i = 0; i < 100; i++) {
			System.out.print("i: "+ i + "\t");
			
		}
		
	}

	private void printNumbers() {
		for (int i = 0; i < 100; i++) {
			System.out.print("i: "+ i + "\t");
			
		}
		
	}

}
