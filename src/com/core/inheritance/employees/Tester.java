package com.core.inheritance.employees;

import java.util.Arrays;

public class Tester extends Employee {
	String[] tools;
	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Tester is testing using these tools.");
		for(String tool: tools) {
			System.out.println("\t"+tool);
		}
	}

	@Override
	public String toString() {
		return "Tester [tools=" + Arrays.toString(tools) + ", id=" + id + ", name=" + name + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
	
}
