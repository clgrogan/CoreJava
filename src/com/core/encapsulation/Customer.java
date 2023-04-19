package com.core.encapsulation;

public class Customer {
	private String firstName;
	private String lastName;
	private String creditCard;
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
