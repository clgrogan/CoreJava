package com.core.flowcontrol;

public class FlowControlAggragate {

	public static void main(String[] args) {
		
		for (String s: args) {
			ifElseLadder(s);
			switchControl(s);
		}
	}
	
	private static void ifElseLadder(String choice) {
		System.out.println("if else ladder with value \""+choice+"\" result:");
		if(choice.equals("Balance")) {
			System.out.println("\tBalance option selected");
		} else if (choice.equals("Change PIN")) {
			System.out.println("\tThe Pin change option selected");
		} else if (choice.equals("Withdrawal")) {
			System.out.println("\tThe withdrawal option selected");
		} else if (choice.equals("Deposit")) {
			System.out.println("\tThe deposit option selected");
		} else {
			System.out.println("\tNone of the valid options were selected");
		}		
	}

	public static void switchControl(String choice) {

		System.out.println("switch with value \""+choice+"\" result:");
		switch (choice) {
		case "Balance":
			System.out.println("\tBalance option selected");
			break;
		case "Withdrawal":
			System.out.println("\tThe withdrawal option selected");
			break;
		case "Deposit":
			System.out.println("\tThe deposit option selected");
			break;
		case "Check PIN":
			System.out.println("\tThe Pin change option selected");
			break;
		default:
			System.out.println("\tNone of the valid options were selected");
		}
	}

}
