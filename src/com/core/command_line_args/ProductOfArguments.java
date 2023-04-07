package com.core.command_line_args;

public class ProductOfArguments {

	public static void main(String[] args) {
		int product = 0;
		for (int i = 0; i < args.length; i++) {
			if (i==0) product = Integer.parseInt(args[i]);
			else product *=  Integer.parseInt(args[i]);
		}
		System.out.println("Product of arguments is " + product);
	}

}
