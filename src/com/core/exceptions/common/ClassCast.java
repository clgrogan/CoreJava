package com.core.exceptions.common;

import com.core.encapsulation.Customer;

public class ClassCast {

	public static void main(String[] args) {
		Object customer = new Customer();
		String s = (String) customer;

	}

}
