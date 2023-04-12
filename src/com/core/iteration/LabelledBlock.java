package com.core.iteration;

public class LabelledBlock {

	public static void main(String[] args) {
		
		int x = 20;
		l1:
		{
			System.out.println("Block begins\n\tx: "+ x);
			if (x >=25) break l1;
			x++;
			if (x >= 20) break l1;
			x++;
			
		}

		System.out.println("After Block\n\tx: "+ x);

	}

}
