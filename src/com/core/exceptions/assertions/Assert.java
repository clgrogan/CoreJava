package com.core.exceptions.assertions;

// execute app with -ea
public class Assert {

	public static void main(String[] args) {
		int withdrawalAmount = 100;
		int currentBalance = 99;
		
		assert (withdrawalAmount <= currentBalance): "\n\tWithdrawal amount is greater than current balance.";
	}

}
