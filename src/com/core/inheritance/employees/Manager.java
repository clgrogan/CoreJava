package com.core.inheritance.employees;

import java.util.Arrays;

public class Manager extends Employee {
	String[] projects;
	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		this.projects = projects;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is working on managing these projects.");
		for(String p: projects) {
			System.out.println("\t"+p);
		}
	}

	@Override
	public String toString() {
		return "Manager [projects=" + Arrays.toString(projects) + ", id=" + id + ", name=" + name + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
	
}
