package com.core.encapsulation;

public class TestCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		printCustomer(customer);
		customer.setFirstName("Bob");
		customer.setLastName("Ross");
		customer.setCreditCard("1234 5678");
		printCustomer(customer);
	}
	
	static void printCustomer(Customer c) {
		System.out.println(c.getFirstName()+"\n"+c.getLastName()+"\n"+c.getCreditCard());
	}
}

