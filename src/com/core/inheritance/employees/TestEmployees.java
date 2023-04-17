package com.core.inheritance.employees;

public class TestEmployees {

	public static void main(String[] args) {
		String[] projects = new String[]{"Flight Reservations", "Check In", "Cancellations"};
		String[] tools = new String[]{"Vudoo", "Stuff", "Judo"};
		String tech = "Java";
		Manager manager = new Manager(1, "Bob", "Villa", 1000000, projects);
		System.out.println(manager);
		manager.work();
		Tester tester = new Tester(2, "Jimm", "Villa", 10000, tools);
		System.out.println(tester);
		tester.work();
		Developer dev = new Developer(3, "Curt", "G", 122000, tech);
		System.out.println(dev);
		dev.work();
		
	}

}
