package com.core.encapsulation.patient;

public class TestPatient {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.setId("A123");
		p.setName("Some Dude");
		p.setSsn(555555555);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSsn());
		
	}
}
