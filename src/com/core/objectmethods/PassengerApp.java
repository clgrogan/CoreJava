package com.core.objectmethods;

public class PassengerApp {

	public static void main(String[] args) {

		Passenger p1 = new Passenger(1, "Bob", "Villa");
		Passenger p1a = p1;
		Passenger p2 = new Passenger(1, "Bob", "Villa");
		Passenger p3 = new Passenger(3, "Bob", "Villa");

		PassengerNoOverrides pNoOver1 = new PassengerNoOverrides(1, "Bob", "Villa");
		PassengerNoOverrides pNoOver1a = pNoOver1;
		PassengerNoOverrides pNoOver2 = new PassengerNoOverrides(1, "Bob", "Villa");
		PassengerNoOverrides pNoOver3 = new PassengerNoOverrides(3, "Bob", "Villa");

		System.out.println("\np1: " + p1);
		System.out.println("p1.hashCode(): " + p1.hashCode());

		System.out.println("\np2: " + p2);
		System.out.println("p2.hashCode(): " + p2.hashCode());

		System.out.println("\np3: " + p3);
		System.out.println("p3.hashCode(): " + p3.hashCode());
		
		System.out.println();
		System.out.println("p1.equals(p1a): "+p1.equals(p1a));
		System.out.println("p1.equals(p2): "+p1.equals(p2));
		System.out.println("p1.equals(p3): "+p1.equals(p3));
		System.out.println();

		System.out.println("pNoOver1: " + pNoOver1);
		System.out.println("pNoOver1.hashCode(): " + pNoOver1.hashCode());

		System.out.println("pNoOver1a: " + pNoOver1a);
		System.out.println("pNoOver1a.hashCode(): " + pNoOver1a.hashCode());

		System.out.println("pNoOver2: " + pNoOver2);
		System.out.println("pNoOver2.hashCode(): " + pNoOver2.hashCode());

		System.out.println("pNoOver3: " + pNoOver3);
		System.out.println("pNoOver3.hashCode(): " + pNoOver3.hashCode());
	}

}
