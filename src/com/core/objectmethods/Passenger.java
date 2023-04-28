package com.core.objectmethods;

public class Passenger {
	private int id;
	private String firstName;
	private String lastName;

	public Passenger(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		
		return "Passenger information is:" 
				+ "\n\tid: " + id 
				+ "\n\tFirst Name: " + firstName 
				+ "\n\tLast Name: " + lastName 
				+ "\n\thashcode: " + this.hashCode();
	}
	
	@Override
	public int hashCode() {
		
		
		return this.id + this.firstName.length()+this.lastName.length();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || getClass() != obj.getClass()) return false;
		if (this == obj) return true;
		Passenger p = (Passenger) obj;
		return (this.hashCode() == p.hashCode() && this.id == p.getId() && this.firstName == p.getFirstName() && this.lastName == p.getLastName());
	}
	
}
