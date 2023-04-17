package com.core.inheritance.employees;

public class Developer extends Employee {
	String technology;
	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		this.technology = technology;
	}
	
	@Override
	protected void work() {
		System.out.println("Developer is working using " + technology);
	}

	@Override
	public String toString() {
		return "Developer [technology=" + technology + ", id=" + id + ", name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
}
